# Open COBOL ESQL 4J

Open COBOL ESQL 4J (OCESQL 4J) consits of open-source Embedded SQL pre-compiler and run time libraries for [opensource COBOL 4J](https://github.com/opensourcecobol/opensourcecobol4j).

# Supported software versions

* opensource COBOL 4J
  * 1.1.2 or later
* PostgreSQL
  * 9.6
  * 15
* OS
  * Ubuntu 24.04
  * Almalinux 9
* Java
  * OpenJDK 11

# Installation and Usage

## Requirements

* Open-source database.
  OCESQL 4J currently supports PostgreSQL database only.

* [opensource COBOL 4j](https://github.com/opensourcecobol/opensourcecobol4j) v1.1.12 or later.

* [sbt](https://www.scala-sbt.org/).


## Installation

### Install opensource COBOL 4J

See [Installation guides of opensource COBOL 4J](https://github.com/opensourcecobol/opensourcecobol4j/wiki).

### Copy libcobj.jar

Copy libcobj.jar, which is the runtime library of opensource COBOL 4J, to `dblibj/lib/libcobj.jar`.
After you complete the installation procedure described in [Installation guides of opensource COBOL 4J](https://github.com/opensourcecobol/opensourcecobol4j/wiki), you can find libcobj.jar in `/usr/lib/opensourcecobol4j/`.

### sbt

See [the official Installation guide](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html).

### Install Open COBOL ESQL 4J

Run the following commands.

```sh
./configure --prefix=/usr/
make
make install
```

Then, add `/usr/lib/Open-COBOL-ESQL-4J/ocesql4j.jar` to $CLASSPATH.

```sh
export CLASSPATH="$CLASSPATH":/usr/lib/Open-COBOL-ESQL-4J/ocesql4j.jar
```
