import os
import re

import re

def update_versions(filepath):
    """
    Updates version information in a file, ignoring lines starting with '#'.

    Args:
      filepath: Path to the file containing version information.
    """

    with open(filepath, 'r') as f:
        lines = f.readlines()

    updated_lines = []
    for line in lines:
        if line.startswith('#') or not line.strip():  # Ignore commented lines
            updated_lines.append(line)
            continue
        print(f"{line}")
        module, released_version, current_version = line.strip().split(':')

        # Move current-version to released-version
        new_released_version = current_version

        # Update current-version based on its format
        if "-SNAPSHOT" in current_version:
            new_released_version = current_version.replace("-SNAPSHOT", "")
            # If there's a patch version, increment it
            if re.match(r"\d+\.\d+\.\d+", new_released_version):
                major, minor, patch = map(int, new_released_version.split('.'))
                new_current_version = f"{major}.{minor}.{patch + 1}-SNAPSHOT"
            else:  # Otherwise, increment the minor version
                major, minor = map(int, new_released_version.split('.'))
                new_current_version = f"{major}.{minor + 1}.0-SNAPSHOT"
        else:
            major, minor, patch = map(int, new_released_version.split('.'))
            new_current_version = f"{major}.{minor + 1}.0"
            new_released_version =  f"{new_released_version}-SNAPSHOT"

        updated_lines.append(f"{module}:{new_released_version}:{new_current_version}\n")

    with open(filepath, 'w') as f:
        f.writelines(updated_lines)

# Example usage
filepath = 'versions.txt'  # Replace with your file path
update_versions(filepath)

def update_pom_versions(repo_path, version_file):
    """
    Updates the version in pom.xml files based on version.txt.

    Args:
        repo_path: Path to the mono repo.
        version_file: Path to the version.txt file.
    """

    # Load version information from version.txt
    versions = {}
    with open(version_file, 'r') as f:
        for line in f:
            try:
                artifact, current, next = line.strip().split(':')
                versions[artifact] = next
            except ValueError:
                print(f"Warning: Invalid line in version.txt: {line.strip()}")

    # Iterate through all pom.xml files
    for root, _, files in os.walk(repo_path):
        for file in files:
            if file == 'pom.xml':
                pom_path = os.path.join(root, file)
                update_pom_version(pom_path, versions)

def update_pom_version(pom_path, versions):
    """
    Updates the version in a single pom.xml file.

    Args:
        pom_path: Path to the pom.xml file.
        versions: Dictionary of artifact names and their current versions.
    """

    with open(pom_path, 'r') as f:
        pom_content = f.read()

    # Find all version lines that need updating
    pattern = r'\s*<version>.*?</version><!-- {x-version-update:.*?:current} -->'
    matches = re.findall(pattern, pom_content)

    # Update the version for each match
    for match in matches:
        artifact = match.split(':')[1]  # Extract artifact name from comment
        print(f"laura artifact {artifact}")
        if artifact in versions:
            new_version = versions[artifact]
            old_version_pattern = r'(<version>).*?(</version>)'
            print(f"laura old_version_pattern {old_version_pattern} + {new_version} + {match}")
            new_version_line = re.sub(old_version_pattern,f"<version>{new_version}</version>", match)
            pom_content = pom_content.replace(match, new_version_line)
        else:
            print(f"Warning: Artifact '{artifact}' not found in version.txt")

    # Write the updated pom.xml file
    with open(pom_path, 'w') as f:
        f.write(pom_content)

if __name__ == '__main__':
    repo_path = '.'  # Replace with the actual path
    version_file = 'versions.txt'  # Replace with the actual path
    update_versions(version_file)
    update_pom_versions(repo_path, version_file)