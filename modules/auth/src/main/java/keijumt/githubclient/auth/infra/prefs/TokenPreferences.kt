package keijumt.githubclient.auth.infra.prefs

import android.content.Context
import keijumt.githubclient.common.util.Preferences

class TokenPreferences(
    context: Context
) : Preferences(context) {

    override val prefsName: String = "token_preferences"

    var token by StringPreference("token", null)
}