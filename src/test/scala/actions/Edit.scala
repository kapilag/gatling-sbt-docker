package actions
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Edit {

  val edit = exec(http("Form")
    .get("/computers/new")
  )
    .pause(1)
    .exec(http("Post new computer").post("/computers")
      .formParam("name", "New Computer")
      .formParam("introduced", "2019-12-20")
      .formParam("discontinued", "2020-12-20")
      .formParam("company", "1")
        .check(status.is(session => 200))
    )

}
