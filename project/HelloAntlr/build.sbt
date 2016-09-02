name := "HelloAntlr"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.6"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-target:jvm-1.7"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.21",
  "junit" % "junit" % "4.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.antlr" % "antlr4" % "4.5",
  "org.antlr" % "antlr4-runtime" % "4.5"
)

antlr4Settings

antlr4PackageName in Antlr4 := Some("qnix.example")

antlr4GenVisitor in Antlr4 := true


// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("org.antlr.v4.runtime.misc.TestRig")

// same as from command line:
// sbt 'run-main org.antlr.v4.runtime.misc.TestRig'
// sbt 'run-main org.antlr.v4.runtime.misc.TestRig qnix.example.Hello r -tokens'
