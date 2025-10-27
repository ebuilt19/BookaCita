#!/bin/bash

echo "Cleaning up repo..."

# Remove IDE files, caches, and build artifacts
rm -rf .idea .vscode target build dist out __pycache__ *.pyc *.log

# Remove compiled or system files
find . -name '*.class' -delete
find . -name '*.DS_Store' -delete

# Optional: remove sensitive files (if you added TODO for env vars)
rm -f application.yml

# Create .gitignore if not exists
if [ ! -f .gitignore ]; then
  echo "Creating .gitignore..."
  cat <<EOF > .gitignore
# OS and IDE
.DS_Store
.idea/
.vscode/

# Build artifacts
target/
build/
out/
dist/

# Logs and temp files
*.log
*.tmp

# Python cache
__pycache__/
*.pyc

# Environment and credentials
.env
application.yml
EOF
fi

echo "Cleanup complete!"
