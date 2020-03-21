package keijumt.githubclient.ui.launcher

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class LauncherFragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeLauncherFragment(): LauncherFragment
}