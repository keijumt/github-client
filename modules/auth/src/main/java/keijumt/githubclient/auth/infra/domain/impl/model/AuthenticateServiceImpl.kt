package keijumt.githubclient.auth.infra.domain.impl.model

import keijumt.githubclient.auth.domain.model.AuthenticateService
import keijumt.githubclient.auth.domain.model.Token
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class AuthenticateServiceImpl : AuthenticateService {
    override suspend fun execute(userName: String, token: Token) = withContext(Dispatchers.IO) {
        // TODO: apiを叩く
    }
}