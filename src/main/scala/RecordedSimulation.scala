
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

  def test(): Unit = {
    val httpProtocol = http
      .baseURL("http://pc.watch.impress.co.jp")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("ja,en-US;q=0.7,en;q=0.3")
      .doNotTrackHeader("1")
      .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.11; rv:50.0) Gecko/20100101 Firefox/50.0")

    val headers_0 = Map(
      "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
      "Upgrade-Insecure-Requests" -> "1")

    val headers_1 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

    val headers_9 = Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "X-Requested-With" -> "XMLHttpRequest")

    val headers_12 = Map("X-Requested-With" -> "XMLHttpRequest")

    val headers_27 = Map(
      "X-CSRF-Token" -> "93AgfxnY57Geva9N9jjzMHfi//uquskrTM2On2GL6uAQyjKBYTZutmHXmT4GPZJq9PSxSqfs9FiT1S6RzHBXUw==",
      "X-Requested-With" -> "XMLHttpRequest")

    val headers_28 = Map(
      "Accept" -> "text/html, */*; q=0.01",
      "X-Requested-With" -> "XMLHttpRequest")

    val headers_40 = Map(
      "X-CSRF-Token" -> "/vW7J++pzs73slyGCOSzhSTjwmTTwNtZJdiNWWiKlmgZT6nZl0dHyQjYavX44dLfp/WM1d6W5ir6wC1XxXEr2w==",
      "X-Requested-With" -> "XMLHttpRequest")

    val uri2 = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"
    val uri3 = "http://beacon.watch.impress.co.jp"
    val uri4 = "http://comcluster.cxense.com/Repo/rep.gif"
    val uri5 = "http://cdn.cxense.com/cx.js"
    val uri6 = "http://www.googletagservices.com/tag/js/gpt.js"
    val uri7 = "http://cloud.watch.impress.co.jp"
    val uri8 = "http://redmine.a-saas.com/time_loggers/render_menu"

    val scn = scenario("RecordedSimulation")
      .exec(http("request_0")
        .get("/")
        .headers(headers_0)
        .resources(http("request_1")
          .post(uri3 + "/measure")
          .headers(headers_1),
          http("request_2")
            .get("/img/pcw/list/1039/880/list.png"),
          http("request_3")
            .get("/img/watch/parts/logo/pcw.svg"),
          http("request_4")
            .get("/img/watch/parts/icon/category.svg"),
          http("request_5")
            .get("/img/watch/parts/icon/facebook.svg"),
          http("request_6")
            .get("/img/watch/parts/icon/crown.svg"),
          http("request_7")
            .get("/img/watch/parts/icon/search-close.svg"),
          http("request_8")
            .get("/img/watch/parts/icon/rss.svg"),
          http("request_9")
            .get("/include/auto/pcw/ranking/access_168_5.json")
            .headers(headers_9),
          http("request_10")
            .get("/img/watch/parts/icon/twitter.svg"),
          http("request_11")
            .get("/img/watch/parts/icon/search.svg"),
          http("request_12")
            .get("/docs/news/news_flash/ym-list.utf")
            .headers(headers_12),
          http("request_13")
            .get("/include/auto/watch/page_components/watch-static-pc-c-pcw.utf")
            .headers(headers_9),
          http("request_14")
            .get("/img/watch/parts/list/breadcrumb.l.png"),
          http("request_15")
            .get("/img/pcw/list/1037/136/list.png"),
          http("request_16")
            .get("/img/watch/parts/icon/topnews.svg"),
          http("request_17")
            .get("/img/pcw/list/1037/478/list.png"),
          http("request_18")
            .get("/img/watch/parts/icon/clock.svg"),
          http("request_19")
            .get("/img/watch/parts/icon/page_top.svg"),
          http("request_20")
            .get("/img/pcw/page_components/site-static-1/win.jpg"),
          http("request_21")
            .get("/img/pcw/page_components/site-static-1/surface.jpg"),
          http("request_22")
            .get("/img/pcw/page_components/site-static-1/4k.jpg"),
          http("request_23")
            .get("/img/pcw/page_components/site-static-1/vr.jpg"),
          http("request_24")
            .get("/img/watch/parts/icon/recommend.svg"),
          http("request_25")
            .get("/img/watch/parts/icon/pr.svg"),
          http("request_26")
            .get("/img/watch/parts/logo/ipc.w63h33.gif"),
          http("request_27")
            .get(uri8 + "?project_id=106&_=1484806647967")
            .headers(headers_27),
          http("request_28")
            .get("/docs/news/news_flash/native.201701.1.utf?v=20161205")
            .headers(headers_28),
          http("request_29")
            .get("/img/watch/parts/icon/rank1.svg"),
          http("request_30")
            .get("/img/watch/parts/icon/rank3.svg"),
          http("request_31")
            .get("/img/watch/parts/icon/rank5.svg"),
          http("request_32")
            .get("/img/watch/parts/icon/rank2.svg"),
          http("request_33")
            .get("/img/watch/parts/icon/rank4.svg")))
      .pause(2)
      .exec(http("request_34")
        .get(uri7 + "/")
        .headers(headers_0)
        .resources(http("request_35")
          .post(uri3 + "/measure")
          .headers(headers_1),
          http("request_36")
            .get(uri5 + ""),
          http("request_37")
            .get(uri7 + "/include/auto/clw/ranking/access_168_5.json")
            .headers(headers_9),
          http("request_38")
            .get(uri7 + "/include/auto/watch/page_components/watch-static-pc-c-clw.utf")
            .headers(headers_9),
          http("request_39")
            .get(uri4 + "?ver=1&typ=pgv&rnd=iy42o2lmw0ly4fmy&acc=0&sid=1142967893938127063&loc=http%3A%2F%2Fcloud.watch.impress.co.jp%2F&ref=http%3A%2F%2Fpc.watch.impress.co.jp%2F&gol=&pgn=&ltm=1484811900202&new=0&arf=0&tzo=-540&res=1760x990&dpr=1.0909091234207153&col=24&jav=1&bln=ja&cks=iy3p3ilwwradcf4m&ckp=iviudjcgh2izm9t4&chs=UTF-8&wsz=1173x572&altm=1484806041761&arnd=iy3z6i74y3fe59u5&aatm=7&axtl=http%3A%2F%2Fwww8.hp.com%2Fjp%2Fja%2Fhpe-news%2Fpress-release.html%3Fid%3D2395721&awsz=1055x554&amvw=1055x1024&fls=1&flv=Shockwave%20Flash%2024.0%20r0")))
      .pause(2)
      .exec(http("request_40")
        .get(uri8 + "?project_id=106&_=1484811662276")
        .headers(headers_40))

    setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
  }

}

object RecordedSimulation {
  def main(args: Array[String]): Unit = {
    new RecordedSimulation().test()
  }
}
