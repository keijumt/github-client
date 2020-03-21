package keijumt.githubclient.auth.infra.domain.impl

import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.domain.model.AuthenticateService
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.domain.repository.UserNameRepository
import keijumt.githubclient.auth.infra.domain.impl.model.AuthenticateServiceImpl
import keijumt.githubclient.auth.infra.domain.impl.repository.TokenRepositoryImpl
import keijumt.githubclient.auth.infra.domain.impl.repository.UserNameRepositoryImpl
import keijumt.githubclient.auth.infra.prefs.TokenPreferences
import keijumt.githubclient.auth.infra.prefs.UserNamePreferences
import javax.inject.Singleton

@Module
internal class DomainImplModule {
    @Singleton
    @Provides
    fun provideTokenRepository(
        tokenPreferences: TokenPreferences
    ): TokenRepository = TokenRepositoryImpl(tokenPreferences)

    @Singleton
    @Provides
    fun provideUserNameRepository(
        userNamePreferences: UserNamePreferences
    ): UserNameRepository = UserNameRepositoryImpl(userNamePreferences)

    @Singleton
    @Provides
    fun provideAuthenticateService(): AuthenticateService = AuthenticateServiceImpl()
}