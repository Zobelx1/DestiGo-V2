import Plugins

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.profile_domain"
}
dependencies {
    implementation(project(":trips:trips_domain"))
}
