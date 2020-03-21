package keijumt.githubclient.common.util

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.WorkerThread
import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

abstract class Preferences(
    private val context: Context
) {
    protected abstract val prefsName: String

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(
            prefsName,
            Context.MODE_PRIVATE
        )
    }

    inner class StringPreference(
        private val name: String,
        private val defaultValue: String?
    ) : ReadWriteProperty<Any, String?> {

        @WorkerThread
        override fun getValue(thisRef: Any, property: KProperty<*>): String? {
            return prefs.getString(name, defaultValue)
        }

        override fun setValue(thisRef: Any, property: KProperty<*>, value: String?) {
            prefs.edit { putString(name, value) }
        }
    }
}
