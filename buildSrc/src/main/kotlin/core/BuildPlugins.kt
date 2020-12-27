/**
 * Configuration of all gradle build plugins
 */
object BuildPlugins {
    val androidApplication = PluginDesc(id = "com.android.application")
    val androidLibrary = PluginDesc(id = "com.android.library")
    val commonsAndroidLibrary = PluginDesc(id = "core.commons.android-library")
    val kotlinKapt = PluginDesc(id = "kotlin-kapt")
    val kotlinAndroid = PluginDesc(id = "kotlin-android")
    val mobileMultiplatform = PluginDesc(id = "dev.icerock.mobile.multiplatform")
    val dynamicFeature = PluginDesc(id = "com.android.dynamic-feature")
    val commonsDynamicFeature = PluginDesc(id = "core.commons.android-dynamic-feature")
    val updateDependencies = PluginDesc(id = "plugins.update-dependencies")
    val detekt = PluginDesc(id = "plugins.detekt")
    val navigationArgs = PluginDesc(id = "androidx.navigation.safeargs.kotlin")
    val kotlinParcelize = PluginDesc(id = "kotlin-parcelize")

    val sqlDelight = PluginDesc(
        id = "com.squareup.sqldelight",
        module = "com.squareup.sqldelight:gradle-core.plugins.plugin:${LibraryVersions.Plugins.sqlDelight}"
    )

    val kotlinMultiplatform = PluginDesc(
        id = "org.jetbrains.kotlin.multiplatform",
        module = "org.jetbrains.kotlin:kotlin-gradle-core.plugins.plugin:${LibraryVersions.Plugins.kotlin}"
    )

    val kotlinSerialization = PluginDesc(
        id = "kotlinx-serialization",
        module = "org.jetbrains.kotlin:kotlin-serialization:${LibraryVersions.Plugins.serialization}"
    )
}
