import sbt.Keys._
import sbt._

object CommonsBuild {
  val settings: Seq[Setting[_]] = Seq(
    organization := "im.actor",
    organizationHomepage := Some(new URL("https://actor.im/")),
    scalaVersion := "2.11.11",
    resolvers ++= Seq(
      Resolver.sonatypeRepo("releases"),
      "Nexus DiegoSilva Releases" at "http://nexus.diegosilva.com.br:8081/nexus/content/repositories/releases/",
      "Nexus DiegoSilva Snapshots" at "http://nexus.diegosilva.com.br:8081/nexus/content/repositories/snapshots/"
    ),
    pomExtra := (
      <url>http://github.com/actorapp/actor-commons</url>
        <licenses>
          <license>
            <name>MIT</name>
            <url>http://www.opensource.org/licenses/MIT</url>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:actorapp/commons.git</url>
          <connection>scm:git:git@github.com:actorapp/commons.git</connection>
        </scm>
        <developers>
          <developer>
            <id>prettynatty</id>
            <name>Andrey Kuznetsov</name>
            <url>http://fear.loathing.in</url>
          </developer>
        </developers>
      )
  )
}
