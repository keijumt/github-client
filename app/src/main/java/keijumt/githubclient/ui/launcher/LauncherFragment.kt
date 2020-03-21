package keijumt.githubclient.ui.launcher

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.android.support.AndroidSupportInjection
import keijumt.githubclient.R
import javax.inject.Inject

internal class LauncherFragment : Fragment(R.layout.fragment_launcher) {

    @Inject
    lateinit var viewModelFactory: LauncherViewModelFactory

    private val navController: NavController by lazy {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val launcherViewModel by viewModels<LauncherViewModel> { viewModelFactory }

        launcherViewModel.destination.observe(viewLifecycleOwner) {
            when (it) {
                LauncherViewModel.Destination.Main -> {
                    // TODO: メイン画面に遷移
                }
                LauncherViewModel.Destination.SignIn -> {
                    navController.navigate(R.id.action_launcher_to_signIn)
                }
            }
        }

        launcherViewModel.onViewCreated()
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}