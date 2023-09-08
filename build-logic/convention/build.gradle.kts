plugins {
    `kotlin-dsl`
}
group = "com.kyawlinnthant.googlenewsclone.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}
gradlePlugin {
    plugins {
        register("android.application") {
            id = "com.kyawlinnthant.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("android.library") {
            id = "com.kyawlinnthant.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("compose.application") {
            id = "com.kyawlinnthant.compose.application"
            implementationClass = "ComposeApplicationPlugin"
        }
        register("compose.library") {
            id = "com.kyawlinnthant.compose.library"
            implementationClass = "ComposeLibraryPlugin"
        }
        register("google.hilt") {
            id = "com.kyawlinnthant.hilt"
            implementationClass = "DaggerHiltPlugin"
        }
        register("androidx.room") {
            id = "com.kyawlinnthant.database.room"
            implementationClass = "DatabasePlugin"
        }
        register("retrofit.network") {
            id = "com.kyawlinnthant.network.retrofit"
            implementationClass = "NetworkPlugin"
        }
        register("androidx.preferences") {
            id = "com.kyawlinnthant.datastore.preferences"
            implementationClass = "DatastorePrefPlugin"
        }
    }
}