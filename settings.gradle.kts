@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        includeBuild("build-logic")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GoogleNewsClone"
include(":app")
include(":data")
include(
    ":cores:navigation",
    ":cores:theme"
)
include(
    ":features:foryou:data",
    ":features:foryou:domain",
    ":features:foryou:presentation",
)
include(
    ":features:headlines:data",
    ":features:headlines:domain",
    ":features:headlines:presentation",
)
include(
    ":features:following:data",
    ":features:following:domain",
    ":features:following:presentation",
)
include(
    ":features:setting:data",
    ":features:setting:domain",
    ":features:setting:presentation",
)

