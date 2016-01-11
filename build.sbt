name := """Thunderbit"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

resolvers += "ylemoigne-maven" at "https://dl.bintray.com/ylemoigne/maven/"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.mongodb" % "mongodb-driver-async" % "3.2.0",
  "de.undercouch" % "bson4jackson" % "2.6.0",
  "fr.javatic.mongo" % "mongo-jackson-codec" % "3.0.4__0.2"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
