package keijumt.githubclient.auth.hostservice

interface CheckAuthenticatedService {
    suspend fun execute(): Boolean
}