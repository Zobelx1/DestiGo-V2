import Plugins

plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.navigation_core"
}
dependencies{
    implementation(project(Modules.Ui.AUTH))
    implementation(project(Modules.Ui.ADD_POST))
    implementation(project(Modules.Ui.DETAILS))
    implementation(project(Modules.Ui.HOME))
    implementation(project(Modules.Ui.PROFILE))
    implementation(project(Modules.Ui.INTERESTED_PLACES))
    implementation(project(Modules.Ui.SCAN))
    implementation(project(Modules.Ui.SEARCH))
    implementation(project(Modules.Ui.TRIPS))
    implementation(project(Modules.Ui.WELCOME))
    implementation(project(Modules.Auth.AUTH_DATA))
    implementation(project(Modules.Auth.AUTH_UI))
    implementation(project(Modules.Auth.AUTH_DOMAIN))

}