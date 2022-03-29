#!/bin/zsh

set -e

docker run --volume "$(pwd):/workspace" --workdir /workspace/proto bufbuild/buf:1.3.0 lint

branch=$(git branch | sed -n -e 's/^\* \(.*\)/\1/p')

#docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.3.0 \
#  breaking --against .git#branch="${branch}"
