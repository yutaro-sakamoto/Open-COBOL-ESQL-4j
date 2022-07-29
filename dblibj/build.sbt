name := "OCESQL4j"

version := "0.1"

scalaVersion := "2.13.6"

val catsCore = "org.typelevel" %% "cats-core" % "2.6.1"
val catsFree = "org.typelevel" %% "cats-free" % "2.6.1"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8" % Test

unmanagedJars in Compile += file("lib/postgresql-42.2.24.jre6.jar")

libraryDependencies ++= Seq(
  catsCore,
  catsFree,
  scalaTest
)

assemblyJarName := "ocesql4j.jar"

ThisBuild / assemblyCacheUnzip := false
