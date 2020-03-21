package keijumt.githubclient.auth.domain.repository

interface UserNameRepository {
    suspend fun find(): String?
    suspend fun store(userName: String)
}