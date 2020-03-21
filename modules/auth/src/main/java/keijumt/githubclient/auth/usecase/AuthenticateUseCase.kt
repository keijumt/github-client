package keijumt.githubclient.auth.usecase

import keijumt.githubclient.auth.domain.model.Token

internal interface AuthenticateUseCase {
    suspend fun execute(userName: String, token: Token): AuthenticateResult
}

sealed class AuthenticateResult {
    object Success : AuthenticateResult()

    sealed class Failure : AuthenticateResult() {
        object InvalidToken : Failure()
        data class UnknownError(val throwable: Throwable) : Failure()
    }
}