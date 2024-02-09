import Plugins
import Modules

plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.profile_data"
}

dependencies {
    implementation(project(Modules.Profile.PROFILE_DOMAIN))
    implementation(project(Modules.Trips.TRIPS_DOMAIN))
}