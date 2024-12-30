#!/bin/bash

# Get the API URL as an argument
if [ -z "$1" ]; then
  echo "Usage: $0 <API_URL>"
  exit 1
fi
API_URL="$1"

# Get the GitHub token from an environment variable
GITHUB_TOKEN="${GITHUB_TOKEN:-}"
if [ -z "$GITHUB_TOKEN" ]; then
  echo "Error: GITHUB_TOKEN environment variable not set."
  exit 1
fi

# Function to check the merge status
check_pr_status() {
  PR_DATA=$(curl -s -H "Authorization: token $GITHUB_TOKEN" "$API_URL")
  if echo "$PR_DATA" | grep -q '"merged": true'; then
    echo "Pull request is merged."
    return 0
  else
    echo "Pull request is not merged. Checking again in 60 seconds..."
    sleep 60
    return 1
  fi
}

# Keep checking until the PR is merged
while check_pr_status; do
  :
done