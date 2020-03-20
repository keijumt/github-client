package keijumt.githubclient

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import keijumt.githubclient.databinding.ActivityMainBinding
import keijumt.githubclient.ui.PageConfiguration

class MainActivity : AppCompatActivity() {

    private val navController: NavController by lazy {
        findNavController(R.id.root_nav_host_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            onDestinationChange(destination)
        }

        // TODO: check StatusBarColors
    }

    private fun onDestinationChange(destination: NavDestination) {
        val config = PageConfiguration.getConfiguration(destination.id)

        if (config.hideToolbar) {
            supportActionBar?.hide()
        } else {
            supportActionBar?.show()
        }

        if (!config.hasTitle) {
            supportActionBar?.title = ""
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(config.displayHomeAsUpEnabled)

        // TODO: check BottomNavigation
    }

    private fun isNightMode(context: Context): Boolean {
        return when (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_YES -> true
            Configuration.UI_MODE_NIGHT_NO -> false
            Configuration.UI_MODE_NIGHT_UNDEFINED -> false
            else -> false
        }
    }
}
