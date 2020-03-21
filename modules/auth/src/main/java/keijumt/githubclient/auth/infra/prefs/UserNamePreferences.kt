package keijumt.githubclient.auth.infra.prefs

import android.content.Context
import keijumt.githubclient.common.util.Preferences

internal class UserNamePreferences(
    context: Context
) : Preferences(context) {
    override val prefsName: String = "user_name_preferences"

    var userName by StringPreference("user_name", null)
}