package keijumt.githubclient.ui.launcher

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import keijumt.githubclient.R
import keijumt.githubclient.databinding.FragmentLauncherBinding

class LauncherFragment : Fragment(R.layout.fragment_launcher) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentLauncherBinding.inflate(layoutInflater)
    }
}