package keijumt.githubclient.auth.hostservice.impl

import keijumt.githubclient.auth.hostservice.GetTokenService
import keijumt.githubclient.auth.usecase.GetTokenUseCase
import keijumt.githubclient.auth.usecase.impl.GetTokenResult

internal class GetTokenServiceImpl(
    private val getTokenUseCase: GetTokenUseCase
) : GetTokenService {
    override suspend fun execute(): String {
        return when (val result = getTokenUseCase.execute()) {
            is GetTokenResult.Success -> {
                result.token.rawValue
            }
            is GetTokenResult.Failure.NotFoundToken -> {
                throw IllegalStateException("token is not found.")
            }
        }
    }
}