lazy val root = (project in file("."))
  .settings(
    organization := "io.github.hayasshi",
    name         := "site",
    version      := s"${java.time.LocalDate.now().toString}",
    scalaVersion := "2.12.6",
  )
  .enablePlugins(ParadoxPlugin)
  .settings(
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    (target in paradox) in Compile := baseDirectory.value / "docs"
  )
