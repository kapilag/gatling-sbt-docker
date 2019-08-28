package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._
object Search {
  val search = exec(http("Home")
    .get("/"))
    .pause(1)
    .exec(http("Search")
      .get("/computers?f=macbook"))
    .pause(1)
    .exec(http("Select a computer")
      .get("/computers/6"))
    .pause(2)
}
