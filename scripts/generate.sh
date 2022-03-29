set -e

./scripts/lint.sh

rm -rf gen/*

docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.3.0 generate
