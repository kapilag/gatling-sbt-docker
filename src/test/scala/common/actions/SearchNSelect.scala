package common.actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object SearchNSelect {
  val search = exec { session =>
    println(s"######Information of session is:${session}#######")
      http("Home")
    .get("/")
    session
  }.pause(1)
    .exec(http("Search")
      .get("/computers?f=macbook"))
    .pause(1)
    .exec(http("Select a computer")
      .get("/computers/6"))
}
