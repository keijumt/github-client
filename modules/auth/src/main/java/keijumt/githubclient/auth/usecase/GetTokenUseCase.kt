package keijumt.githubclient.auth.usecase

import keijumt.githubclient.auth.usecase.impl.GetTokenResult

interface GetTokenUseCase {
    suspend fun execute(): GetTokenResult
}