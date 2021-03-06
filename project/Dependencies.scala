import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    // "typesafe repo"   at "http://repo.typesafe.com/typesafe/releases/",
  )

  def compile   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")
  def provided  (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")
  def test      (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")
  def runtime   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "runtime")
  def container (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "container")

  val asm         = "org.ow2.asm" % "asm"           % "4.1"
  val asmTree     = "org.ow2.asm" % "asm-tree"      % "4.1"
  val asmAnalysis = "org.ow2.asm" % "asm-analysis"  % "4.1"
  val asmUtil     = "org.ow2.asm" % "asm-util"      % "4.1"
  val testNG      = "org.testng"  % "testng"        % "5.14.1"

  def scalaTest(scalaVersion: String) = scalaVersion match {
    case x if x startsWith "2.9"  => "org.scalatest" %% "scalatest" % "1.8"
    case "2.10.0"                 => "org.scalatest" %% "scalatest" % "1.9.1"
  }
}
