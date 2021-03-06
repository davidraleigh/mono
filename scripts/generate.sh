#!/bin/zsh

set -e

./scripts/lint.sh

set +e

rm -rf cpp/proto/**/*.pb.cc
rm -rf cpp/proto/**/*.pb.h
rm -rf go/proto/**/*.pb.go
rm -rf java/proto/**/*.java
rm -rf js/proto/**/*_pb.js
rm -rf net/proto/**/*.cs
rm -rf python/proto/**/*_pb2*.py
rm -rf ruby/proto/**/*_pb*.rb

docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.3.0 generate
