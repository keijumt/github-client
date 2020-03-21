package keijumt.githubclient.api

data class AuthorizationHeader(
    val token: String
) {
    override fun toString(): String = "token $token"
}