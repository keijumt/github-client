plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:4.1.0-alpha03")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70")
}