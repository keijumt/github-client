package keijumt.githubclient.auth.usecase

import dagger.Module
import dagger.Provides
import keijumt.githubclient.auth.domain.model.AuthenticateService
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.domain.repository.UserNameRepository
import keijumt.githubclient.auth.usecase.impl.AuthenticateUseCaseImpl
import keijumt.githubclient.auth.usecase.impl.GetTokenUseCaseImpl
import javax.inject.Singleton

@Module
internal class UseCaseModule {
    @Singleton
    @Provides
    fun provideAuthenticateUseCase(
        authenticateService: AuthenticateService,
        tokenRepository: TokenRepository,
        userNameRepository: UserNameRepository
    ): AuthenticateUseCase = AuthenticateUseCaseImpl(
        authenticateService,
        tokenRepository,
        userNameRepository
    )

    @Singleton
    @Provides
    fun getTokenUseCase(
        tokenRepository: TokenRepository
    ): GetTokenUseCase = GetTokenUseCaseImpl(
        tokenRepository
    )
}