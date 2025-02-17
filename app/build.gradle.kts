plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "cz.pslib.test"
    compileSdk = 34

    defaultConfig {
        applicationId = "cz.pslib.test"
        minSdk = 30
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.work.runtime.ktx)
    dependencies {
        // Material 3
        implementation (libs.material3)

        // Navigation
        implementation(libs.androidx.navigation.compose)

        // Jetpack Compose
        implementation(libs.ui)
        implementation(libs.ui.tooling.preview)
        implementation(libs.ui.tooling)
        implementation(libs.androidx.activity.compose.v172)

        // Core KTX and Lifecycle
        implementation(libs.androidx.core.ktx.v1120)
        implementation(libs.androidx.lifecycle.runtime.ktx.v262)
        // image
        implementation(libs.coil.compose)

        // Retrofit a Gson
        implementation(libs.retrofit2.retrofit)
        implementation(libs.converter.gson)
        // Testing
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit.v115)
        androidTestImplementation(libs.androidx.espresso.core.v351)
        androidTestImplementation(libs.ui.test.junit4)
        debugImplementation(libs.ui.test.manifest)
    }

}