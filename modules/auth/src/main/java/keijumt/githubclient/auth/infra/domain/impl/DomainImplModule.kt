package keijumt.githubclient.auth.infra.domain.impl

import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.infra.domain.impl.repository.TokenRepositoryImpl
import keijumt.githubclient.auth.infra.prefs.TokenPreferences
import javax.inject.Singleton

@Module
internal class DomainImplModule {
    @Singleton
    @Provides
    fun provideTokenRepository(
        tokenPreferences: TokenPreferences
    ): TokenRepository = TokenRepositoryImpl(tokenPreferences)
}