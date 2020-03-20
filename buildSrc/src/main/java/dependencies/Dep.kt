import org.gradle.api.artifacts.dsl.DependencyHandler

object Dep {
    object GradlePlugin {
        const val android = "com.android.tools.build:gradle:4.1.0-alpha03"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70"
        const val navigation =
            "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.0-alpha04"
    }

    object Kotlin {
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.2.0-alpha03"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"

        const val coreKtx = "androidx.core:core-ktx:1.3.0-alpha02"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.3.0-alpha02"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-alpha01"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"
        const val paging = "androidx.paging:paging-runtime:3.0.0-SNAPSHOT"

        object Lifecycle : Applicable {
            override fun DependencyHandler.apply() {
                implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-alpha01")
            }
        }

        object Navigation : Applicable {
            override fun DependencyHandler.apply() {
                implementation("androidx.navigation:navigation-fragment-ktx:2.3.0-alpha04")
                implementation("androidx.navigation:navigation-ui-ktx:2.3.0-alpha04")
            }
        }

        object Room : Applicable {
            override fun DependencyHandler.apply() {
                implementation("androidx.room:room-runtime:2.2.5")
                kapt("androidx.room:room-compiler:2.2.5")
                implementation("androidx.room:room-ktx:2.2.5")
            }
        }
    }

    object Dagger : Applicable {
        override fun DependencyHandler.apply() {
            implementation("com.google.dagger:dagger:2.27")
            implementation("com.google.dagger:dagger-android:2.27")
            implementation("com.google.dagger:dagger-android-support:2.27")

            kapt("com.google.dagger:dagger-compiler:2.27")
            kapt("com.google.dagger:dagger-android-processor:2.27")
        }
    }

    object Retrofit : Applicable {
        override fun DependencyHandler.apply() {
            implementation("com.squareup.retrofit2:retrofit:2.7.2")
            implementation("com.squareup.retrofit2:converter-moshi:2.7.2")
        }
    }

    object OkHttp : Applicable {
        override fun DependencyHandler.apply() {
            implementation("com.squareup.okhttp3:okhttp:4.4.1")
            implementation("com.squareup.okhttp3:logging-interceptor:4.4.1")
        }
    }

    const val material = "com.google.android.material:material:1.2.0-alpha05"

    object Test {
        const val junit = "junit:junit:4.12"
        const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }
}