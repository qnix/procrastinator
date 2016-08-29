name := "HelloScala"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.6"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-target:jvm-1.7"

incOptions := incOptions.value.withNameHashing(true)

lazy val json4sNative  = "org.json4s" %% "json4s-native" % "3.4.0"
lazy val json4sJackson = "org.json4s" %% "json4s-jackson" % "3.4.0"

lazy val Scalaz = "org.scalaz" %% "scalaz-core" % "7.2.3"

lazy val Netlib = "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly()

libraryDependencies ++= Seq(
  json4sNative,
  json4sJackson,
  "junit" % "junit" % "4.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

// http://mvnrepository.com/artifact/com.esotericsoftware.kryo/kryo
libraryDependencies += "com.esotericsoftware.kryo" % "kryo" % "2.24.0"

libraryDependencies ++= Seq(
  Scalaz,
  // "org.apache.spark" %% "spark-core" % "1.6.0",
  // "org.apache.spark" %% "spark-mllib" % "1.6.0",
  Netlib
)
