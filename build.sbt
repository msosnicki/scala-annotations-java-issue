ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "scala-compiler-issues",
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core" % "jackson-databind"       % "2.17.2",
      "jakarta.validation"         % "jakarta.validation-api" % "3.1.0",
    ),
    compileOrder := CompileOrder.ScalaThenJava,
  )
