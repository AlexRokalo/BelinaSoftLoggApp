package alex.mrrok.loginapp.injection

import alex.mrrok.loginapp.presentation.screens.loginactivity.LoginViewModel
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
 interface AppComponent {
    fun inject(mainViewModel: LoginViewModel)
}