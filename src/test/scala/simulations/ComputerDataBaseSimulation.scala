package simulations

import actions.{Browse, Edit, SearchNSelect}
import common.{BaseSimulation, HttpBuilder}
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class ComputerDataBaseSimulation  extends Simulation {

  val admins = scenario("For admins").exec(SearchNSelect.search,Browse.multiplePage,Edit.edit)

 setUp(
    admins.inject(atOnceUsers(1))
      .protocols(HttpBuilder.getDefault())
  ).assertions(
    global.responseTime.mean.lt(1500),
    global.failedRequests.count.is(0)//This will take care of error in request
  )

}
