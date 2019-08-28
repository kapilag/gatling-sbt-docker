import sbt._
object Libs {

  val ScalaVersion = "2.11.9"

  object Gatling {
    val VERSION              = "3.2.1"
    val `gatling-framework`  = "io.gatling"            % "gatling-test-framework"    % VERSION % "test"
    val `gatling-high-charts`= "io.gatling.highcharts" % "gatling-charts-highcharts" % VERSION % "test"
  }

}
