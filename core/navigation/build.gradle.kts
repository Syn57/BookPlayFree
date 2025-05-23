plugins {
    alias(libs.plugins.bpf.library)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.bpf.compose.lib)
}

android {
    namespace = "com.zachnr.bookplayfree.navigation"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.androidx.navigation.runtime.ktx)
}