plugins {
    `android-partial`
    id("androidx.navigation.safeargs.kotlin")
}

android.buildFeatures.dataBinding = true

dependencies {
    apply(Module.common)
    apply(Module.resource)
    apply(Module.api)

    apply(Dep.Dagger)
    apply(Dep.OkHttp)
    apply(Dep.Retrofit)
}