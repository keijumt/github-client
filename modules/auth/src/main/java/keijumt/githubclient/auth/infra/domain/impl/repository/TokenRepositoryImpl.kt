package keijumt.githubclient.auth.infra.domain.impl.repository

import keijumt.githubclient.auth.domain.model.Token
import keijumt.githubclient.auth.domain.repository.TokenRepository
import keijumt.githubclient.auth.infra.prefs.TokenPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

internal class TokenRepositoryImpl @Inject constructor(
    private val tokenPreferences: TokenPreferences
) : TokenRepository {
    override suspend fun find(): Token? = withContext(Dispatchers.IO) {
        tokenPreferences.token?.let { Token(it) }
    }

    override suspend fun store(token: Token) = withContext(Dispatchers.IO) {
        tokenPreferences.token = token.rawValue
    }
}