//Next two lines only needed if you decide to use the assembly plugin
import AssemblyKeys._
assemblySettings

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-unchecked", "-deprecation")

name := "twitter-stream-reader"

version := "0.1"

//ibatis_version := "2.1.7.597"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.1.0",
	"org.slf4j" % "slf4j-simple" % "1.6.1",
	"org.slf4j" % "slf4j-api" % "1.6.1",
	"org.twitter4j" % "twitter4j-core" % "3.0.3",
	"org.twitter4j" % "twitter4j-stream" % "3.0.3")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Twitter4j Repository" at "http://twitter4j.org/maven2"
