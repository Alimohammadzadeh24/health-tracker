plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp")
    id("dev.iurysouza.modulegraph") version "0.9.0"
}

android {
    namespace = "com.alimmz.steptracker"
    compileSdk = ConfigData.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.alimmz.steptracker"
        minSdk = ConfigData.MIN_SDK_VERSION
        targetSdk = ConfigData.TARGET_SDK_VERSION
        versionCode = ConfigData.VERSION_CODE
        versionName = ConfigData.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "VERSION_NAME", "\"${ConfigData.VERSION_NAME}\"")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.valueOf(libs.versions.java.get())
        targetCompatibility = JavaVersion.valueOf(libs.versions.java.get())
    }
    kotlinOptions {
        jvmTarget = JavaVersion.valueOf(libs.versions.java.get()).toString()
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    moduleGraphConfig {
        readmePath.set("./README.md")
        heading = "### Module Graph"
    }
}

dependencies {

    implementation(libs.coil)
    implementation(libs.coil.svg)
    implementation(libs.coil.video)

    implementation(libs.hilt.android)
    implementation(libs.hilt.navigation.compose)
    implementation(project(":core:navigation"))
    ksp(libs.hilt.androidx.compiler)
    ksp(libs.hilt.compiler)

    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.websockets)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.client.logging.jvm)
    implementation(libs.ktor.client.content.negotiation)

    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)
    implementation(libs.coroutines.guava)

    implementation(libs.timber)
    implementation(libs.okhttp.logging)

    coreLibraryDesugaring(libs.desugaring)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}