plugins {
    id("com.android.application")
    id("kotlin-android")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-android-extensions")
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

    buildFeatures.dataBinding = true
}

dependencies {
    apply(Module.common)
    apply(Module.auth)

    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.constraint)
    implementation(Dep.AndroidX.coreKtx)
    implementation(Dep.AndroidX.fragmentKtx)
    implementation(Dep.AndroidX.livedataKtx)

    apply(Dep.AndroidX.Lifecycle)
    apply(Dep.AndroidX.Navigation)

    implementation(Dep.material)

    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.Test.espresso)
}