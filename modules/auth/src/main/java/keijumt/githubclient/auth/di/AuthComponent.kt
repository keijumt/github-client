package keijumt.githubclient.auth.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import keijumt.githubclient.api.GithubApi
import keijumt.githubclient.auth.hostservice.CheckAuthenticatedService
import keijumt.githubclient.auth.ui.signin.SignInFragmentModule
import keijumt.githubclient.common.di.DispatchingInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AuthModule::class,
        SignInFragmentModule::class
    ]
)
interface AuthComponent : AndroidInjector<DispatchingInjector> {

    fun checkAuthenticatedService(): CheckAuthenticatedService

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance api: GithubApi
        ): AuthComponent
    }
}