name := "OCESQL4j"

version := "0.1"

scalaVersion := "2.13.14"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
)

assemblyJarName := "ocesql4j.jar"

scalacOptions := Seq("-Werror", "-deprecation", "-unchecked")

ThisBuild / assemblyCacheUnzip := false
