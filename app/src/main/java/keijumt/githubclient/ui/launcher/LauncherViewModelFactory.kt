package keijumt.githubclient.ui.launcher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import keijumt.githubclient.auth.hostservice.CheckAuthenticatedService
import javax.inject.Inject

internal class LauncherViewModelFactory @Inject constructor(
    private val checkAuthenticatedService: CheckAuthenticatedService
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        LauncherViewModel(
            checkAuthenticatedService
        ) as T
}