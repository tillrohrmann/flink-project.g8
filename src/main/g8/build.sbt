resolvers in ThisBuild ++= Seq("Apache Development Snapshot Repository" at "https://repository.apache.org/content/repositories/snapshots/",
  Resolver.mavenLocal)

val flinkVersion = "1.2-SNAPSHOT"

val flinkDependencies = Seq(
  "org.apache.flink" %% "flink-streaming-java" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-connector-kafka-0.9" % flinkVersion)

lazy val commonSettings = Seq (
  version := "1.0-SNAPSHOT",
  organization := "org.stsffap",
  scalaVersion := "2.10.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "kafkaTest",
    libraryDependencies ++= flinkDependencies
  )

// make run command include the provided dependencies
run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))

// exclude Scala library from assembly
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)