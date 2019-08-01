import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name             := "fp-mortals-playground",
    scalaVersion     := "2.13.0",
    version          := "0.1.0-SNAPSHOT",
    organization     := "ir.itstar",
    organizationName := "itstar",
    libraryDependencies ++= Seq(
      scalaTest  % Test,
      scalaCheck % Test,
      logBack
    ),
    scalacOptions := Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-Ypartial-unification"
    )
  )
