import Plugins

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.details_domain"
}
dependencies {
    implementation(project(":core:core_domain"))
}
