import Plugins

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.posts_ui"
}
dependencies {
    implementation(project(Modules.Core.CORE_DOMAIN))
    implementation(project(Modules.Core.CORE_UI))
    implementation(project(Modules.NAVIGATION))

}