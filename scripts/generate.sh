set -e

./scripts/lint.sh

docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.3.0-fix generate
