name := "farmers-app"
organization := "com.farmersapp"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.9"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.44",
  "com.h2database" % "h2" % "1.4.197",
  "org.hibernate" % "hibernate-core" % "4.2.0.Final"
)

