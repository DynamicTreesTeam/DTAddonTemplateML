# Dynamic Trees Addon Template

This is a multiloader template for creating Dynamic Trees addons for Minecraft. It supports both Fabric and NeoForge, allowing you to create addons that work across multiple modloaders from a single codebase.

## Quick Start

1. **Change the mod ID**: Edit the `mod_id` property in `gradle.properties` to your addon's ID
2. **Read the wiki**: Check out the [Dynamic Trees wiki](https://github.com/DynamicTreesTeam/DynamicTrees/wiki) for detailed documentation on creating tree addons
3. **Add mod dependencies**: Use CurseMaven to add the mod you're creating an addon for to your build (see below)

## Adding Mod Dependencies

To add the mod you're creating an addon for, use the CurseMaven snippet format in your loader-specific `build.gradle` file.

For example, in `fabric/build.gradle` or `neoforge/build.gradle`:

```groovy
dependencies {
    implementation fg.deobf("curse.maven:modname-projectid:fileid")
}
```

You can find the CurseMaven snippet on the mod's CurseForge page under the "Curse Maven" section in the Files tab.

## Project Structure

- **common/** - Shared code for both loaders (tree definitions, species, etc.)
- **fabric/** - Fabric-specific loader code
- **neoforge/** - NeoForge-specific loader code

## Setup

1. Click the "Use this template" button on GitHub to create your own repository based on this template
2. Clone your new repository to your computer
3. Edit `gradle.properties` to configure your addon (`mod_id`, `mod_name`, `mod_author`, `group`)
4. Edit `settings.gradle` and change `rootProject.name` to match your project folder
5. Open the project in IntelliJ IDEA
6. Set the Gradle JVM to Java 21 if needed (File > Settings > Build, Execution, Deployment > Build Tools > Gradle)
7. Set the Project SDK to Java 21 (File > Project Structure > Project SDK)
8. Refresh the Gradle project
