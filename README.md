Giter8 Flink project template
=============================

This is [giter8](https://github.com/n8han/giter8) template to generate a [Flink](http://flink.apache.org) project using Scala and SBT.

How to use
----------

First make sure [sbt](http://www.scala-sbt.org/) is installed (you need version 0.13.13 or later)

In order to generate a Flink project enter on the command line:

```
$ sbt new tillrohrmann/flink-project.g8
```

This will prompt for a couple of parameters (project name, scala version...) and the generate a Flink project using Scala and SBT.

You can then follow the [README.md of the generated project](src/main/g8/README.md) for build and run instructions.
