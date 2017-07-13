import sbt._
import sbt.Keys._
import com.typesafe.sbt.SbtScalariform._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys._
import com.typesafe.sbt.pgp.PgpKeys._

object ClarifyBuild extends Build {
  import scalariform.formatter.preferences._

  lazy val clarifySettings = Defaults.coreDefaultSettings ++ Seq(
    version := "0.0.4",
    organization := "org.usagram",
    crossScalaVersions := Seq("2.12.2", "2.11.0", "2.10.0"),
    scalaVersion <<= crossScalaVersions { versions => versions.head },
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

  lazy val clarify = Project(
    id = "clarify-project",
    base = file("."),
    settings = clarifySettings ++ doNotPublish
  ) aggregate(core, generation)

  lazy val core = Project(
    id = "clarify",
    base = file("core"),
    settings = clarifySettings
  )

  lazy val generation = Project(
    id = "clarify-generation",
    base = file("generation"),
    settings = clarifySettings ++ doNotPublish
  )

  lazy val doNotPublish = Seq(
    publish := {},
    publishLocal := {},
    publishSigned := {},
    publishLocalSigned := {}
  )
}
