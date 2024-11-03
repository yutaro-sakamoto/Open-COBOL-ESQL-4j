FROM almalinux:9

SHELL ["/bin/bash", "-c"]

# classpath settings
ENV CLASSPATH :/usr/lib/opensourcecobol4j/libcobj.jar:/usr/lib/Open-COBOL-ESQL-4j/ocesql4j.jar:/usr/lib/Open-COBOL-ESQL-4j/postgresql.jar
RUN echo 'export CLASSPATH=:/usr/lib/opensourcecobol4j/libcobj.jar:/usr/lib/Open-COBOL-ESQL-4j/postgresql.jar:/usr/lib/Open-COBOL-ESQL-4j/ocesql4j.jar' >> ~/.bashrc

# install dependencies
RUN dnf update -y
RUN dnf install -y epel-release
RUN dnf install -y gcc make bison flex automake autoconf diffutils gettext java-21-openjdk-devel git-clang-format cppcheck libtool gettext-devel

# install sbt
RUN curl -fL https://github.com/coursier/coursier/releases/latest/download/cs-x86_64-pc-linux.gz | gzip -d > cs && chmod +x cs && echo Y | ./cs setup
RUN mkdir -p /workspaces/Open-COBOL-ESQL-4j