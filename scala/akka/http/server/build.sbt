name := "akka-http-server-example"

organization := "io.github.amutake"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M2",
  "org.json4s" %% "json4s-jackson" % "3.2.11"
)
