plugins {
    `android-partial`
    kotlin("plugin.serialization") version "1.3.70"
}

android {
    defaultConfig {
        buildConfigField("String", "API_URL", "\"https://api.github.com/\"")
    }
}

dependencies {
    apply(Module.common)

    apply(Dep.OkHttp)
    apply(Dep.Retrofit)
}