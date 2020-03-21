package keijumt.githubclient.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import keijumt.githubclient.api.GithubApi
import keijumt.githubclient.auth.hostservice.CheckAuthenticatedService
import keijumt.githubclient.common.di.DispatchingInjector
import keijumt.githubclient.ui.launcher.LauncherFragmentModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        LauncherFragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<DispatchingInjector> {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance api: GithubApi,
            @BindsInstance checkAuthenticatedService: CheckAuthenticatedService
        ): AppComponent
    }
}
