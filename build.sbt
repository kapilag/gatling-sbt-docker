
version := "0.1"
scalaVersion := Libs.ScalaVersion

lazy val `gatling-sbt-docker` = project
  .in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(libraryDependencies ++= Dependencies.gatling)