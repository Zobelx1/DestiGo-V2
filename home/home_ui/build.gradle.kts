import Plugins
plugins{
    id(Plugins.COMMON)
}
android{
    namespace= "com.mobilebreakero.home_ui"
}
dependencies {
    implementation(libs.animated.navigation.bar)
    implementation(project(Modules.Posts.POSTS_DOMAIN))
    implementation(project(Modules.Profile.PROFILE_DOMAIN))
}