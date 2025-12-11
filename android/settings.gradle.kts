pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

include(":app")
include(":MapJava")
include(":MapApi")

include(":pagination")
project(":pagination").projectDir = File(rootProject.projectDir, "compose/pagination")

include(":data")
project(":data").projectDir = File(rootProject.projectDir, "compose/data")

include(":common")
project(":common").projectDir = File(rootProject.projectDir, "compose/common")

include(":kompakt")
project(":kompakt").projectDir = File(rootProject.projectDir, "compose/kompakt")

File(rootProject.projectDir, "compose/screens")
    .listFiles()
    ?.forEach { moduleFile ->
        val moduleName = ":${moduleFile.name}"
        include(moduleName)
        project(moduleName).projectDir = moduleFile
    }

include(":frontitude")
