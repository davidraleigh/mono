#!/bin/zsh

set -e

docker run --volume "$(pwd):/workspace" --workdir /workspace/proto bufbuild/buf:1.3.0-fix lint

branch=$(git branch | sed -n -e 's/^\* \(.*\)/\1/p')

docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.3.0-fix \
  breaking --against .git#branch="${branch}"
