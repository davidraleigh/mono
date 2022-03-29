# create a virtual env if one doesn't exist
python3 -m venv .venv
source .venv/bin/activate

# add pre-commit
pip install pre-commit
pre-commit install

docker pull bufbuild/buf:1.3.0
