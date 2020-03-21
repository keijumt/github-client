package keijumt.githubclient.auth.ui.signin

import androidx.lifecycle.*
import keijumt.githubclient.auth.usecase.AuthenticateResult
import keijumt.githubclient.auth.usecase.AuthenticateUseCase
import keijumt.githubclient.common.util.SingleLiveEvent
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class SignInViewModel @Inject constructor(
    private val authenticateUseCase: AuthenticateUseCase
) : ViewModel() {

    val userName = MutableLiveData("")
    val token = MutableLiveData("")

    val isAuthenticateButtonEnabled: LiveData<Boolean> =
        userName.asFlow().combine(token.asFlow()) { userName, token ->
            userName.isNotBlank() && token.isNotBlank()
        }.asLiveData(viewModelScope.coroutineContext)

    private val _navigateToMain = SingleLiveEvent<Unit>()
    val navigateToMain: LiveData<Unit> = _navigateToMain

    fun onClickAuthenticate() {
        val userName = userName.value ?: return
        val token = token.value ?: return

        viewModelScope.launch {
            when (authenticateUseCase.execute(userName, token)) {
                is AuthenticateResult.Success -> {
                    _navigateToMain.value = Unit
                }
                is AuthenticateResult.Failure.InvalidToken -> {
                    // TODO: ErrorHandling
                }
            }
        }
    }
}