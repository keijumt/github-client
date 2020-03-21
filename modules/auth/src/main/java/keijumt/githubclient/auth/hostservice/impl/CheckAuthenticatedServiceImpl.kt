package keijumt.githubclient.auth.hostservice.impl

import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.hostservice.CheckAuthenticatedService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class CheckAuthenticatedServiceImpl(
    private val tokenRepository: TokenRepository
) : CheckAuthenticatedService {
    override suspend fun execute(): Boolean = withContext(Dispatchers.IO) {
        tokenRepository.find() != null
    }
}