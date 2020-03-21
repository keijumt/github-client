package keijumt.githubclient.auth.ui.signin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import keijumt.githubclient.auth.usecase.AuthenticateUseCase
import javax.inject.Inject

internal class SignInViewModelFactory @Inject constructor(
    private val authenticateUseCase: AuthenticateUseCase
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        SignInViewModel(authenticateUseCase) as T
}