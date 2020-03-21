package keijumt.githubclient.auth.domain.model

interface AuthenticateService {
    suspend fun execute(userName: String, token: Token)
}