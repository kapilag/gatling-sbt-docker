package simulations

import actions.{Browse, Edit, Search}
import common.{BaseSimulation, HttpBuilder}
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class ComputerDataBaseSimulation  extends Simulation {

  val admins = scenario("For admins").exec(Search.search,Browse.multiplePage,Edit.edit)

  setUp(
    admins.inject(atOnceUsers(1))
      .protocols(HttpBuilder.getDefault())
  )
}
