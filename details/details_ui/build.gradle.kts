import Plugins
import Modules

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.details_ui"
}

dependencies {
    implementation(project(Modules.Details.DETAILS_DOMAIN))
}