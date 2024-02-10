plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.navigation_core"
}
dependencies {

    implementation(project(Modules.Ui.SEARCH))
    implementation(project(Modules.Auth.AUTH_UI))
    implementation(project(Modules.Profile.PROFILE_UI))
    implementation(project(Modules.Posts.POSTS_UI))
    implementation(project(Modules.Trips.TRIPS_UI))
    implementation(project(Modules.Splash.SPLASH_UI))
    implementation(project(Modules.Details.DETAILS_UI))
}