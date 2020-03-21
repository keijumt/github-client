package keijumt.githubclient.api.json

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserJson(
    @SerialName("login")
    val name: String,
    @SerialName("name")
    val displayName: String,
    @SerialName("avatar_url")
    val avatarUrl: String,
    @SerialName("followers")
    val followers: Int,
    @SerialName("following")
    val following: Int
)