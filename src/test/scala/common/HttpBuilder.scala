package common

import io.gatling.http.Predef.http
import io.gatling.http.protocol
import io.gatling.core.Predef._

object HttpBuilder {

  def getDefault(): protocol.HttpProtocolBuilder = {
    val httpBuilder = http
      .baseUrl("http://computer-database.gatling.io")
      .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
      .upgradeInsecureRequestsHeader("1")
      .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")

    httpBuilder
  }

}
