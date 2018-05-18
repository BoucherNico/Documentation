lazy val docs = (project in file("."))
  .enablePlugins(ParadoxPlugin)
  .settings(
    name := "Documentation ToolBox OPUN",
    paradoxTheme := Some(builtinParadoxTheme("generic"))
  )
