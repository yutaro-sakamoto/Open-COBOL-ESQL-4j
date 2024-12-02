#!/bin/bash

# Install opensource COBOL 4J
cd opensourcecobol4j/
./configure --prefix=/usr/
make
make install
cd ../

# Install Open COBOL ESQL 4J
cp /usr/lib/opensourcecobol4j/libcobj.jar dblibj/lib/
cp /usr/lib/opensourcecobol4j/libcobj.jar dblibj/lib/
mkdir -p /usr/lib/Open-COBOL-ESQL-4j
curl -L -o /usr/lib/Open-COBOL-ESQL-4j/postgresql.jar https://jdbc.postgresql.org/download/postgresql-42.2.24.jar
cp /usr/lib/Open-COBOL-ESQL-4j/postgresql.jar dblibj/lib/
./configure --prefix=/usr/
make
make install

# Set up git config
git config --global --add safe.directory /workspaces/Open-COBOL-ESQL-4j

# Set up ~/.bashrc
cat .devcontainer/term_settings/extra_bashrc.sh >> ~/.bashrc