plugins {
    `android-partial`
    id("androidx.navigation.safeargs.kotlin")
}

android.buildFeatures.dataBinding = true

dependencies {
    implementation(Dep.material)

    apply(Dep.Dagger)
    apply(Dep.OkHttp)
    apply(Dep.Retrofit)
}