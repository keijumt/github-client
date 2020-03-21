package keijumt.githubclient.auth.infra

import android.app.Application
import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.infra.domain.impl.DomainImplModule
import keijumt.githubclient.auth.infra.prefs.TokenPreferences
import keijumt.githubclient.auth.infra.prefs.UserNamePreferences
import javax.inject.Singleton

@Module(
    includes = [
        DomainImplModule::class
    ]
)
internal class InfraModule {
    @Singleton
    @Provides
    fun provideTokenPreferences(
        application: Application
    ): TokenPreferences = TokenPreferences(application)

    @Singleton
    @Provides
    fun provideUserNamePreferences(
        application: Application
    ): UserNamePreferences = UserNamePreferences(application)
}