import Plugins

plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.posts_domain"
}
dependencies{
    implementation(project(Modules.Core.CORE_DATA))
}