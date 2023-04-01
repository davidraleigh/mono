#!/bin/zsh

set -e

./scripts/lint.sh

set +e

rm -rf cpp/route_guide/**/*.pb.cc
rm -rf cpp/route_guide/**/*.pb.h
rm -rf go/route_guide/**/*.pb.go
rm -rf java/proto/**/*.java
rm -rf js/route_guide/**/*_pb.js
rm -rf net/proto/**/*.cs
rm -rf python/route_guide/**/*_pb2*.py
rm -rf ruby/route_guide/**/*_pb*.rb

docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf:1.16.0-fix generate
