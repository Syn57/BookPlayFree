import com.zachnr.bookplayfree.buildlogic.utils.Modules

plugins {
    alias(libs.plugins.bpf.application)
    alias(libs.plugins.bpf.compose.app)
}

android {
    namespace = "com.zachnr.bookplayfree"
}

dependencies {
    implementation(project(Modules.Core.NAVIGATION))
    implementation(project(Modules.Features.SPLASH_SCREEN))
    implementation(project(Modules.Core.DESIGN_SYSTEM))
    implementation(project(Modules.Features.DASHBOARD))
    implementation(project(Modules.SHARED))

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)

    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.startup.runtime)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}