buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Dep.GradlePlugin.android)
        classpath(Dep.GradlePlugin.kotlin)
        classpath(Dep.GradlePlugin.navigation)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://androidx-dev-prod.appspot.com/snapshots/builds/6295087/artifacts/repository") }
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}