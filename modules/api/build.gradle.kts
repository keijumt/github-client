plugins {
    `android-partial`
}

dependencies {
    apply(Module.common)

    apply(Dep.OkHttp)
    apply(Dep.Retrofit)
}