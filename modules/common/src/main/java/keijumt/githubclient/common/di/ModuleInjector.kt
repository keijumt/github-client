package keijumt.githubclient.common.di

import dagger.android.AndroidInjector

class ModuleInjector : AndroidInjector<Any> {

    private val injectorList = mutableListOf<DispatchingInjector>()

    fun addInjector(injector: DispatchingInjector) {
        injectorList.add(injector)
    }

    override fun inject(instance: Any) {
        val wasInjected =
            injectorList.any { it.dispatchingAndroidInjector().maybeInject(instance) }
        require(wasInjected) { "injection failed" }
    }
}