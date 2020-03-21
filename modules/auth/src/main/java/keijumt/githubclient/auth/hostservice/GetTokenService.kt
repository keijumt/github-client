package keijumt.githubclient.auth.hostservice

interface GetTokenService {
    suspend fun execute(): String
}