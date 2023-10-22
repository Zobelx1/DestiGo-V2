import org.jetbrains.kotlin.konan.properties.Properties

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlinKapt)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.mobilebreakero.destigo"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.mobilebreakero.destigo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {

            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.firebase.auth.ktx)
    implementation(project(mapOf("path" to ":core:data")))
    implementation(project(mapOf("path" to ":core:domain")))
    implementation(project(mapOf("path" to ":ui:home")))
    implementation(project(mapOf("path" to ":ui:profile")))
    implementation(project(mapOf("path" to ":ui:scan")))
    implementation(project(mapOf("path" to ":ui:trips")))
    implementation(project(mapOf("path" to ":ui:auth")))
    implementation(project(mapOf("path" to ":ui:Interestedplaces")))
    implementation(project(mapOf("path" to ":ui:welcome")))
    implementation(project(mapOf("path" to ":ui:navigation")))
    implementation(project(mapOf("path" to ":common-ui")))
    implementation(libs.firebase.firestore.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    implementation(libs.accompanist.navigationAnimation)
    implementation(libs.animated.navigation.bar)


    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    // hilt
    implementation(libs.hilt.android)
    implementation(libs.hilt.navigation)
    implementation(libs.hilt.navigation.compose)
    kapt(libs.hilt.android.compiler)

    implementation(libs.firebase.auth)
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
}