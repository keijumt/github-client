package keijumt.githubclient.auth.ui.signin

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.android.support.AndroidSupportInjection
import keijumt.githubclient.auth.R
import keijumt.githubclient.auth.databinding.FragmentSignInBinding
import javax.inject.Inject

internal class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    @Inject
    lateinit var viewModelFactory: SignInViewModelFactory

    private val navController: NavController by lazy {
        findNavController()
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        val signInViewModel by viewModels<SignInViewModel> { viewModelFactory }
        val binding = FragmentSignInBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = signInViewModel
        }

        signInViewModel.navigateToMain.observe(viewLifecycleOwner) {
            // TODO: Navigate to main
        }
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}

