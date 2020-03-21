package keijumt.githubclient.auth.infra.domain.impl.repository

import keijumt.githubclient.auth.domain.repository.UserNameRepository
import keijumt.githubclient.auth.infra.prefs.UserNamePreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

internal class UserNameRepositoryImpl @Inject constructor(
    private val userNamePreferences: UserNamePreferences
) : UserNameRepository {
    override suspend fun find(): String? = withContext(Dispatchers.IO) {
        userNamePreferences.userName
    }

    override suspend fun store(userName: String) = withContext(Dispatchers.IO) {
        userNamePreferences.userName = userName
    }
}