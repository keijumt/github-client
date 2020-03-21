package keijumt.githubclient.auth.infra

import android.app.Application
import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.infra.domain.impl.DomainImplModule
import keijumt.githubclient.auth.infra.prefs.TokenPreferences

@Module(
    includes = [
        DomainImplModule::class
    ]
)
internal class InfraModule {
    @Provides
    fun provideTokenPreferences(
        application: Application
    ): TokenPreferences = TokenPreferences(application)
}