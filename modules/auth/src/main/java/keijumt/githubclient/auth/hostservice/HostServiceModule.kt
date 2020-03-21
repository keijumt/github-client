package keijumt.githubclient.auth.hostservice

import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.hostservice.impl.CheckAuthenticatedServiceImpl
import keijumt.githubclient.auth.hostservice.impl.GetTokenServiceImpl
import keijumt.githubclient.auth.usecase.GetTokenUseCase
import javax.inject.Singleton

@Module
internal class HostServiceModule {
    @Singleton
    @Provides
    fun provideCheckAuthenticatedService(
        tokenRepository: TokenRepository
    ): CheckAuthenticatedService = CheckAuthenticatedServiceImpl(tokenRepository)

    @Singleton
    @Provides
    fun provideGetTokenService(
        getTokenUseCase: GetTokenUseCase
    ): GetTokenService = GetTokenServiceImpl(getTokenUseCase)
}