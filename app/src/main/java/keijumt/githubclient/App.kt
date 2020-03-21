package keijumt.githubclient

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import keijumt.githubclient.auth.di.DaggerAuthComponent
import keijumt.githubclient.common.di.DispatchingInjector
import keijumt.githubclient.common.di.ModuleInjector
import keijumt.githubclient.di.DaggerAppComponent

class App : Application(), HasAndroidInjector {

    private val moduleInjector = ModuleInjector()

    override fun onCreate() {
        super.onCreate()

        val authInjector = DispatchingInjector()
        val authComponent = DaggerAuthComponent.factory().create(
            application = this
        )
        authComponent.inject(authInjector)

        val checkAuthenticatedService = authComponent.checkAuthenticatedService()

        val appInjector = DispatchingInjector()
        val appComponent = DaggerAppComponent.factory().create(
            application = this,
            checkAuthenticatedService = checkAuthenticatedService
        )
        appComponent.inject(appInjector)

        moduleInjector.apply {
            addInjector(authInjector)
            addInjector(appInjector)
        }
    }

    override fun androidInjector(): AndroidInjector<Any> = moduleInjector
}