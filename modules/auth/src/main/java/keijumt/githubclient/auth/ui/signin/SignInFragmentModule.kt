package keijumt.githubclient.auth.ui.signin

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SignInFragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeSignInFragment(): SignInFragment
}