import Plugins

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.details_data"
}

dependencies {
    implementation(project(Modules.Core.CORE_DOMAIN))
    implementation(project(Modules.Core.CORE_DATA))
    implementation(project(Modules.Details.DETAILS_DOMAIN))
}