plugins {
    id("com.kyawlinnthant.android.library")
    id("com.kyawlinnthant.compose.library")
    id("com.kyawlinnthant.hilt")
}

android {
    namespace = "com.kyawlinnthant.headlines.presentation"
}
dependencies {
    api(project(":cores:navigation"))
}