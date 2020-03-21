package keijumt.githubclient.auth.usecase.impl

import keijumt.githubclient.auth.domain.model.AuthenticateService
import keijumt.githubclient.auth.domain.model.Token
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.domain.repository.UserNameRepository
import keijumt.githubclient.auth.usecase.AuthenticateResult
import keijumt.githubclient.auth.usecase.AuthenticateUseCase
import javax.inject.Inject

internal class AuthenticateUseCaseImpl @Inject constructor(
    private val authenticateService: AuthenticateService,
    private val tokenRepository: TokenRepository,
    private val userNameRepository: UserNameRepository
) : AuthenticateUseCase {
    override suspend fun execute(userName: String, tokenRawValue: String): AuthenticateResult {
        val token = Token(tokenRawValue)
        try {
            authenticateService.execute(userName, token)
        } catch (e: Exception) {
            return AuthenticateResult.Failure.UnknownError(e)
        }

        tokenRepository.store(token)
        userNameRepository.store(userName)

        return AuthenticateResult.Success
    }
}