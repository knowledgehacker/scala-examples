//Next two lines only needed if you decide to use the assembly plugin
import AssemblyKeys._
assemblySettings

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-unchecked", "-deprecation")

name := "account-reader"

version := "0.1"

//ibatis_version := "2.1.7.597"

libraryDependencies ++= Seq(
	"org.slf4j" % "slf4j-simple" % "1.6.1",
	"org.slf4j" % "slf4j-api" % "1.6.1",
	"mysql" % "mysql-connector-java" % "5.1.31",
    //"org.apache.ibatis" % "ibatis-core" % "3.0",
    //"org.apache.ibatis" % "ibatis-sqlmap" % "3.0-beta-10")
    "com.ibatis" % "ibatis2-common" % "2.1.7.597",
    "com.ibatis" % "ibatis2-sqlmap" % "2.1.7.597")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
