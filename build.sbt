name := "akka-js-test"

scalaVersion := "2.12.6"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.akka-js" %%% "akkajsactorstream" % "1.2.5.14"
)
