object Dep {
    object GradlePlugin {
        const val android = "com.android.tools.build:gradle:4.1.0-alpha03"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.2.0-alpha03"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"

        const val coreKtx = "androidx.core:core-ktx:1.3.0-alpha02"
    }

    object Kotlin {
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }
}