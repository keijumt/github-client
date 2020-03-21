package keijumt.githubclient.auth.usecase.impl

import keijumt.githubclient.auth.domain.model.Token
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.usecase.GetTokenUseCase

internal class GetTokenUseCaseImpl(
    private val tokenRepository: TokenRepository
) : GetTokenUseCase {
    override suspend fun execute(): GetTokenResult =
        tokenRepository.find()?.let { GetTokenResult.Success(it) }
            ?: GetTokenResult.Failure.NotFoundToken
}

sealed class GetTokenResult {
    data class Success(val token: Token) : GetTokenResult()

    sealed class Failure : GetTokenResult() {
        object NotFoundToken : Failure()
    }
}