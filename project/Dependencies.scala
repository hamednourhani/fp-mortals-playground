import sbt._

object Dependencies {

  lazy val scalaTest  = "org.scalatest"  %% "scalatest"      % ScalaTestVersion
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck"     % ScalaCheckVersion
  lazy val logBack    = "ch.qos.logback" % "logback-classic" % LogbackVersion

  private lazy val LogbackVersion = "1.2.3"
  private val ScalaTestVersion    = "3.0.8"
  private val ScalaCheckVersion   = "1.13.4"

}
