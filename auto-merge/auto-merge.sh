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
get_pr_link() {
    local pr_number=$1
    local token=$2
    _PR = "https://api.github.com/repos/$REPO/pulls/$pr_number"
    ${_PR} = "https://api.github.com/repos/$REPO/pulls/$pr_number"
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
    get_pr_link "$pr_number" "$TOKEN"
done
