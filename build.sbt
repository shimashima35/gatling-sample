name := """gatling-test"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.3"
)


scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

fork in run := true
