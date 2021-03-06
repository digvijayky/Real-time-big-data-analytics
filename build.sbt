name := "Real-time-big-data-analytics"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.0",
  "it.unimi.dsi" % "fastutil" % "6.3",
  "com.clarifai" % "clarifai-api-java" % "1.0.1"
)