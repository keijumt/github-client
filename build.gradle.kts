buildscript {
    val kotlinVersion by extra { "1.3.70" }
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}