package keijumt.githubclient.auth.domain.repository

import keijumt.githubclient.auth.domain.model.Token

interface TokenRepository {
    suspend fun find(): Token?
    suspend fun store(token: Token)
}