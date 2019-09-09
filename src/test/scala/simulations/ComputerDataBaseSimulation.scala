package simulations


import common.HttpBuilder
import common.actions.{Browse, Edit, SearchNSelect}
import io.gatling.core.Predef._


class ComputerDataBaseSimulation extends Simulation {

  val admins = scenario("For admins").exec(SearchNSelect.search,Browse.multiplePage,Edit.edit)

 setUp(
    admins.inject(atOnceUsers(1))
      .protocols(HttpBuilder.getDefault())
  ).assertions(
    global.responseTime.mean.lt(1500),
    global.failedRequests.count.is(0)//This will take care of error in request
  )

}
