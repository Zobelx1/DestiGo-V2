import Plugins

plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.trips_ui"
}
dependencies {
    implementation(project(Modules.Core.CORE_DOMAIN))
    implementation(project(Modules.Core.CORE_UI))
    implementation(project(Modules.NAVIGATION))



}