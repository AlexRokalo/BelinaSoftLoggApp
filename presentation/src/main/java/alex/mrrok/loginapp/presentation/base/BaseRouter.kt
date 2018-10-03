package alex.mrrok.loginapp.presentation.base

import alex.mrrok.data.entity.Error
import alex.mrrok.data.entity.ErrorType
import android.widget.Toast


open class BaseRouter<A : BaseActivity>(private var activity: A) {

    fun goBack() {
        activity.onBackPressed()
    }

    fun hideKeyboard() {
        activity.hideKeyboard()
    }

    fun showError(t: Throwable) {
        val error = t as Error
        when (error.errorType) {
            ErrorType.INTERNET_IS_NOT_AVAILABLE -> Toast.makeText(activity, "Internet is not available!", Toast.LENGTH_LONG).show()
            else -> Toast.makeText(activity, "Validate error", Toast.LENGTH_LONG).show()
        }
    }

}