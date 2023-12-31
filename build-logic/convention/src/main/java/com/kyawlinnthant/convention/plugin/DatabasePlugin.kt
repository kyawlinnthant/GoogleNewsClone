import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class DatabasePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val googleKsp = "com.google.devtools.ksp"
        val serialization = "org.jetbrains.kotlin.plugin.serialization"

        with(target) {
            with(pluginManager) {
                apply(googleKsp)
                apply(serialization)
            }
            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            val serializationJson = libs.findLibrary("serialization-json").get()
            val room = libs.findBundle("room").get()
            val roomCompiler = libs.findLibrary("room-compiler").get()
            dependencies {
                add("implementation", room)
                add("implementation", serializationJson)
                add("ksp", roomCompiler)
            }
        }
    }
}