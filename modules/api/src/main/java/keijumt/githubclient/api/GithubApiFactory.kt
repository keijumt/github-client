package keijumt.githubclient.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit

object GithubApiFactory {
    @UnstableDefault
    fun create(): GithubApi = Retrofit.Builder()
        .baseUrl(BuildConfig.API_URL)
        .client(
            OkHttpClient.Builder()
                .build()
        )
        .addConverterFactory(Json(JsonConfiguration(ignoreUnknownKeys = true)).asConverterFactory("application/json".toMediaType()))
        .build()
        .create(GithubApi::class.java)
}