import Plugins

plugins {
    id(Plugins.COMMON)
}


android {
    namespace = "com.mobilebreakero.posts_data"
}
dependencies {
    implementation(project(Modules.Core.CORE_DOMAIN))
    implementation(project(Modules.Core.CORE_DATA))
    implementation(project(Modules.Posts.POSTS_DOMAIN))



}
