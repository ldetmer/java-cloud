#!/bin/bash

# Function to fetch release PRs
get_release_prs() {
    local token=$1
    local repo=$2
    local desc=$3
    while true; do
      local response=$(curl -s -H "Authorization: token $token" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$repo/pulls")
      # Extract PR numbers from the response JSON 
      echo "$response" | jq --arg desc "$desc" -r '.[] | select(.title | startswith($desc)) | .number'

      PR_NUMBER=$(echo "$response" | jq --arg desc "$desc" -r '.[] | select(.title | startswith($desc)) | .number')

      if [ -n "$PR_NUMBER" ]; then
        echo "$PR_NUMBER"
        return 0  # PR found
      else
        #echo "No PR found starting with '$desc'. Trying again in 60 seconds..."
        sleep 60
      fi
    done
}

# Function to merge a PR
check_if_pr_mergable() {
    local pr_number=$1
    local token=$2
    local repo=$3
    while true; do
      local response=$(curl -s -H "Authorization: token $token" -H "Accept: application/vnd.github+json" "https://api.github.com/repos/$repo/pulls/$pr_number")
      # Check if the PR is mergeable
      if jq -e '.mergeable' <<< "$response" > /dev/null; then
        echo "https://api.github.com/repos/$REPO/pulls/$pr_number"
        exit 1
      else
        echo "PR #$pr_number is not mergeable"
        sleep 60
      fi
    done
}

# Main script execution
if [[ $# -ne 3 ]]; then
    echo "Usage: $0 <your-github-access-token> <repo> <pr text>"
    exit 1
fi

TOKEN=$1
REPO=$2
DESC=$3

release_prs=$(get_release_prs "$TOKEN" "$REPO" "$DESC")

# Iterate over PR numbers and attempt to merge them
for pr_number in $release_prs; do
    check_if_pr_mergable "$pr_number" "$TOKEN" "$REPO"
done
