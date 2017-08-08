import com.typesafe.sbt.SbtScalariform.scalariformSettings
import com.typesafe.sbt.SbtScalariform.ScalariformKeys._
import scalariform.formatter.preferences._
import com.typesafe.sbt.pgp.PgpKeys._

// settings

val clarifySettings = Defaults.coreDefaultSettings ++ Seq(
  version := "0.0.4",
  organization := "org.usagram",
  crossScalaVersions := Seq("2.12.2", "2.11.8"),
  scalaVersion := crossScalaVersions.value.head,
  scalacOptions ++= Seq("-target:jvm-1.8", "-unchecked", "-deprecation", "-Xcheckinit", "-encoding", "utf8", "-feature", "-Ywarn-unused-import"),
  javacOptions ++= Seq("-target", "1.8", "-source", "1.8", "-Xlint:deprecation"),
  publishTo := Some(Resolver.file("fie", file(".")))
) ++ scalariformSettings ++ Seq(
  preferences := preferences.value
    .setPreference(AlignParameters, true)
    .setPreference(AlignArguments, true)
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(CompactControlReadability, true)
)

val doNotPublish = Seq(
  publish := {},
  publishLocal := {},
  publishSigned := {},
  publishLocalSigned := {}
)

// projects

val core = Project(
  id = "clarify",
  base = file("core"),
  settings = clarifySettings ++ Seq(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
)

val generation = Project(
  id = "clarify-generation",
  base = file("generation"),
  settings = clarifySettings ++ doNotPublish
)

val clarify = Project(
  id = "clarify-project",
  base = file("."),
  settings = clarifySettings ++ doNotPublish
).aggregate(core, generation)
