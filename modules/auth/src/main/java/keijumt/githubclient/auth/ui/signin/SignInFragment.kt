package keijumt.githubclient.auth.ui.signin

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.android.support.AndroidSupportInjection
import keijumt.githubclient.auth.R
import keijumt.githubclient.auth.databinding.FragmentSignInBinding
import javax.inject.Inject

internal class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    @Inject
    lateinit var viewModelFactory: SignInViewModelFactory

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        val signInViewModel by viewModels<SignInViewModel> { viewModelFactory }
        val binding = FragmentSignInBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = signInViewModel
        }
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}

