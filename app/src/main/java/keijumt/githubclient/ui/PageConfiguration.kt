package keijumt.githubclient.ui

import androidx.annotation.IdRes
import keijumt.githubclient.R

enum class PageConfiguration(
    val id: Int,
    val hasTitle: Boolean = true,
    val hideToolbar: Boolean = false,
    val displayHomeAsUpEnabled: Boolean = false,
    val hideBottomNavigation: Boolean = false
) {
    Launcher(
        R.id.launcher,
        hasTitle = false,
        hideToolbar = true
    ),
    SignIn(
        R.id.signIn,
        hasTitle = false,
        hideToolbar = true
    ),
    Other(0);

    companion object {
        fun getConfiguration(@IdRes id: Int): PageConfiguration {
            return enumValues<PageConfiguration>().firstOrNull { it.id == id } ?: Other
        }
    }
}