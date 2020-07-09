import core.dependencies.Dependencies

plugins {
    id("core.commons.android-dynamic-feature")
}

android {
    sourceSets.getByName("main") {
        res.srcDir("src/main/res/")
        res.srcDir("src/main/res/layouts/activity")
        res.srcDir("src/main/res/layouts/fragment")
        res.srcDir("src/main/res/layouts/views")
    }
}

val merseyModules = listOf(
    BuildModules.Libraries.MerseyLibs.archy,
    BuildModules.Libraries.MerseyLibs.utils
)

val merseyLibs = listOf(
    Dependencies.MerseyLibs.archy,
    Dependencies.MerseyLibs.utils
)

dependencies {
    if (Dependencies.isLocalDependencies) {
        merseyModules.forEach { module -> api(project(module)) }
    } else {
        merseyLibs.forEach { lib -> api(lib) }
    }

    implementation(Dependencies.LIVEDATA_KTX)
}
