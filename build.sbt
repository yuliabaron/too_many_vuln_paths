organization := "com.example"

name := "sbt-large-vulnerable-tree"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  "io.buoyant" %% "admin" % "1.4.6",
  "io.buoyant" %% "config" % "1.4.6",
  "io.buoyant" %% "linkerd-core" % "1.4.6",
  "io.buoyant" %% "namer-core" % "1.4.6",
  "io.buoyant" %% "namerd-core" % "1.4.6",
  "io.buoyant" %% "telemetry-core" % "1.4.6"
)
