package keijumt.githubclient.auth.usecase

internal interface AuthenticateUseCase {
    suspend fun execute(userName: String, token: String): AuthenticateResult
}

sealed class AuthenticateResult {
    object Success : AuthenticateResult()

    sealed class Failure : AuthenticateResult() {
        object InvalidToken : Failure()
        data class UnknownError(val throwable: Throwable) : Failure()
    }
}