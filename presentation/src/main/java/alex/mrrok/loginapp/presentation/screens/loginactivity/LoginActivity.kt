package alex.mrrok.loginapp.presentation.screens.loginactivity

import alex.mrrok.loginapp.R
import alex.mrrok.loginapp.databinding.ActivityLoginBinding
import alex.mrrok.loginapp.presentation.base.BaseMvvmActivity
import alex.mrrok.loginapp.presentation.screens.mEmails
import alex.mrrok.loginapp.presentation.screens.utils.DogTokenizer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.view.View
import android.widget.EditText
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : BaseMvvmActivity<LoginViewModel, ActivityLoginBinding, LoginRouter>() {

    override fun provideViewModel(): LoginViewModel {
        return ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun provideRouter(): LoginRouter = LoginRouter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel?.emailText?.set(input_email)
        viewModel?.passwordText?.set(input_password)


        input_email.setAdapter(ArrayAdapter<String>(this@LoginActivity,
                android.R.layout.simple_dropdown_item_1line, mEmails))
        input_email.threshold = 1
        input_email.setTokenizer(DogTokenizer())


        btn_regist.setOnClickListener {
            if (!viewModel!!.validate())
                return@setOnClickListener

            viewModel?.registry?.regist(input_email.text.toString(), input_password.text.toString())
                    ?.subscribe({}, { viewModel?.error(it) })
        }


        setFocus(input_email)
        setFocus(input_password)
    }

    private fun setFocus(editText: EditText) {
        editText.setOnFocusChangeListener(object : View.OnFocusChangeListener {
            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                if (hasFocus) editText.alpha = 1f
                else editText.alpha = 0.7f
            }
        })
    }

}
