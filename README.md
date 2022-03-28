## Requirements
- docker
- python3

## Scripts

From [scripts to rule them all](https://github.blog/2015-06-30-scripts-to-rule-them-all/) using the following commands allows for setup, code generation and linting.

### Setup

Creates a python3 virtual environment for pre-commit and builds a fixed docker image of bufbuild/buf
```
./scripts/setup.sh
```

### Lint

Tests the proto files for any errors.
```
./scripts/lint.sh
```

### Build
Generate code from proto files
```
./scripts/build.sh
```
