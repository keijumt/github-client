package keijumt.githubclient.common.di

import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class DispatchingInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    fun dispatchingAndroidInjector() = dispatchingAndroidInjector
}