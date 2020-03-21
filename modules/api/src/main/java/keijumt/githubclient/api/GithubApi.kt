package keijumt.githubclient.api

import keijumt.githubclient.api.json.UserJson
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface GithubApi {
    @GET("users/{userName}")
    suspend fun getUser(
        @Header("Authorization") authorizationHeader: AuthorizationHeader,
        @Path("userName") userName: String
    ): UserJson
}