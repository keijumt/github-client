plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(Version.compileSdkVersion)

    defaultConfig {
        applicationId = "keijumt.githubclient"
        minSdkVersion(Version.minSdkVersion)
        targetSdkVersion(Version.targetSdkVersion)
        versionCode = Version.versionCode
        versionName = Version.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    apply(Module.auth)

    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.constraint)
    implementation(Dep.AndroidX.coreKtx)
    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.Test.espresso)
}