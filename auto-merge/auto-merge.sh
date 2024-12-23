#!/bin/bash

# Set your GitHub repository
REPO="ldetmer/java-cloud"

# Function to fetch release PRs
get_release_prs() {
    local token=$1
    local response=$(curl -s -H "Authorization: token $token" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/pulls")
    # Extract PR numbers from the response JSON
    echo "$response" | jq -r '.[] | select(.title | startswith("chore(main): release")) | .number'
}

# Function to merge a PR
merge_pr() {
    local pr_number=$1
    local token=$2
    while true; do
      local response=$(curl -s -H "Authorization: token $token" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/pulls/$pr_number")
      # Check if the PR is mergeable
      if jq -e '.mergeable' <<< "$response" > /dev/null; then
          local merge_response=$(curl -s -X PUT -H "Authorization: token $token" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$REPO/pulls/$pr_number/merge" 2>&1)
          if [[ "$merge_response" == *"message"* ]]; then
            echo "Error merging PR #$pr_number:"
            echo "$merge_response" | jq . 
            sleep 60
          else
            echo "Merged PR #$pr_number"
            return 0
          fi
      else
        echo "PR #$pr_number is not mergeable"
        sleep 60
      fi
    done
}

# Main script execution
if [[ $# -ne 1 ]]; then
    echo "Usage: $0 <your-github-access-token>"
    exit 1
fi

TOKEN=$1
release_prs=$(get_release_prs "$TOKEN")

# Iterate over PR numbers and attempt to merge them
for pr_number in $release_prs; do
    merge_pr "$pr_number" "$TOKEN"
done
