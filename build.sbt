import Dependencies._

lazy val `gatling-sbt-docker` = project
  .in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.somecompany",
      scalaVersion := Libs.ScalaVersion,
      version := "0.1"
    )),
    libraryDependencies ++= gatling
  )