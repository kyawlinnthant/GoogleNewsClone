@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.kotlin).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.google.hilt).apply(false)
    alias(libs.plugins.google.kts).apply(false)
    alias(libs.plugins.kotlin.serialization).apply(false)
}
//Workaround for "Expecting an expression" build error
println("")