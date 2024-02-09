import Plugins
import Modules

plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.trips_ui"
}

dependencies {
    implementation(project(Modules.Trips.TRIPS_DOMAIN))
}