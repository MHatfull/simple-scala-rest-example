import sbtassembly.Plugin._

name := "rest"

version := "1.0"

scalaVersion := "2.10.4"

val sprayVersion = "1.2.1"

val akkaVersion = "2.2.4"

libraryDependencies ++= Seq(
  "io.spray" % "spray-can" % sprayVersion,
  "io.spray" % "spray-http" % sprayVersion,
  "io.spray" % "spray-routing" % sprayVersion,
  "io.spray" % "spray-testkit" % sprayVersion % "test",
  "net.liftweb" % "lift-json_2.10" % "2.5.1",
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "com.typesafe.akka" % "akka-actor_2.10" % akkaVersion,
  "com.typesafe.akka" % "akka-slf4j_2.10" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.specs2" %% "specs2" % "2.3.13" % "test"
)

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

scalacOptions ++= Seq("-Xmax-classfile-name", "100")

assemblySettings
