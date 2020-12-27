import core.dependencies.Dependencies
import core.extensions.implementation

plugins {
    plugin(BuildPlugins.commonsAndroidLibrary)
}

dependencies {
    implementation(project(BuildModules.Commons.UI))

    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.FRAGMENT_KTX)

    implementation(Dependencies.MerseyLibs.utils)
}
