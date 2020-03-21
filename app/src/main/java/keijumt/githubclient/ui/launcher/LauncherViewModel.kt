package keijumt.githubclient.ui.launcher

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import keijumt.githubclient.auth.hostservice.CheckAuthenticatedService
import keijumt.githubclient.common.util.SingleLiveEvent
import kotlinx.coroutines.launch
import javax.inject.Inject

class LauncherViewModel @Inject constructor(
    private val checkAuthenticatedService: CheckAuthenticatedService
) : ViewModel() {
    enum class Destination {
        Main, SignIn
    }

    private val _destination = SingleLiveEvent<Destination>()
    val destination: LiveData<Destination> = _destination

    fun onViewCreated() {
        viewModelScope.launch {
            if (checkAuthenticatedService.execute()) {
                _destination.value = Destination.Main
            } else {
                _destination.value = Destination.SignIn
            }
        }
    }
}