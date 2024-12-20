import requests
import json
import sys

# Set your GitHub repository
REPO = "ldetmer/java-cloud"

def get_release_prs(token):
    """Fetches pull requests with titles starting with "chore(main): release"."""
    headers = {"Authorization": f"token {token}", "Accept": "application/vnd.github+json"}
    url = f"https://api.github.com/repos/{REPO}/pulls"
    response = requests.get(url, headers=headers)
    response.raise_for_status()
    prs = [pr["number"] for pr in response.json() if pr["title"].startswith("chore(main): release")]
    return prs

def merge_pr(pr_number, token):
    """Merges the given pull request if it is mergeable."""
    headers = {"Authorization": f"token {token}", "Accept": "application/vnd.github+json"}
    url = f"https://api.github.com/repos/{REPO}/pulls/{pr_number}"
    response = requests.get(url, headers=headers)
    response.raise_for_status()
    pr = response.json()
    if pr["mergeable"]:
        merge_url = f"https://api.github.com/repos/{REPO}/pulls/{pr_number}/merge"
        response = requests.put(merge_url, headers=headers)
        response.raise_for_status()
        print(f"Merged PR #{pr_number}")
    else:
        print(f"PR #{pr_number} is not mergeable")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python merge_release_prs.py <your-github-access-token>")
        sys.exit(1)

    TOKEN = sys.argv[1]
    release_prs = get_release_prs(TOKEN)
    for pr_number in release_prs:
        merge_pr(pr_number, TOKEN)