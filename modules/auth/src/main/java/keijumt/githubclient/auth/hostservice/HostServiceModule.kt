package keijumt.githubclient.auth.hostservice

import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.hostservice.impl.CheckAuthenticatedServiceImpl
import javax.inject.Singleton

@Module
internal class HostServiceModule {
    @Singleton
    @Provides
    fun provideCheckAuthenticatedService(
        tokenRepository: TokenRepository
    ): CheckAuthenticatedService = CheckAuthenticatedServiceImpl(tokenRepository)
}