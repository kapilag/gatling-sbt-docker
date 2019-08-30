package actions
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Browse{

  def gotoPage(page:Int) = exec(http("Page ${n}")
    .get("/computers?p=" + page)).pause(1)

  def multiplePage = repeat(5,"n"){
    exec(
      http("Page ${n}")
      .get("/computers?p=${n}")
      .check(status.is(200))
    ).pause(1)
  }

}
