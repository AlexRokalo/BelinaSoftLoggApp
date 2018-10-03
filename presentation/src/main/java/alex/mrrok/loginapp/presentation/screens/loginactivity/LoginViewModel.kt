package alex.mrrok.loginapp.presentation.screens.loginactivity

import alex.mrrok.domain.usecase.RegistrationUser
import alex.mrrok.loginapp.app.App
import alex.mrrok.loginapp.presentation.base.BaseActivity
import alex.mrrok.loginapp.presentation.base.BaseRouter
import alex.mrrok.loginapp.presentation.base.BaseViewModel
import android.databinding.ObservableField
import android.util.Log

import android.widget.EditText
import javax.inject.Inject

class LoginViewModel : BaseViewModel<BaseRouter<BaseActivity>>() {
    var email = ObservableField("")
    var password = ObservableField("")

    var emailText = ObservableField<EditText>()
    var passwordText = ObservableField<EditText>()

    lateinit var registry: RegistrationUser
        @Inject set


    fun validate(): Boolean {
        var valid = true

        val email = emailText.get()!!.text.toString()
        val password = passwordText.get()!!.text.toString()
        val domain = emailText.get()!!.text.toString().split(".") as MutableList<String>

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
                || !android.util.Patterns.TOP_LEVEL_DOMAIN.matcher(domain[domain.size - 1]).matches()) {
            emailText.get()!!.error = "ввидите правильный email"
            valid = false
        } else {
            emailText.get()!!.error = null
        }


        if (password.isEmpty() || password.length < 8 || password.length > 20) {
            passwordText.get()!!.error = "не мение 8 символов"
            valid = false
        } else {
            passwordText.get()!!.error = null
        }

        return valid

    }


    fun error(error: Throwable) {
        router?.showError(error)
    }

    override fun runInjcet() {
        App.appComponent?.inject(this)
    }
}