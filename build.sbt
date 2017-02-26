name := "jobs-processing-approaches"

version := "1.0"

scalaVersion := "2.12.1"
val akkaVersion = "2.4.17"
val akkaHttpVersion = "10.0.4"

libraryDependencies ++= Seq(
  // config, logging stuff
  "com.typesafe" % "config" % "1.3.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",

  // webserver stuff
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "io.spray" %% "spray-json" % "1.3.3"

  // "com.typesafe.akka" %% "akka-actor" % akkaVersion,
)
    