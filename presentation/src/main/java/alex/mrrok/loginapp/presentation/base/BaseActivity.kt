package alex.mrrok.loginapp.presentation.base


import android.content.Context
import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import android.view.inputmethod.InputMethodManager


 abstract class BaseActivity : AppCompatActivity() {


    private var compositeDisposable: CompositeDisposable? = null

    protected fun getCompositeDisposable(): CompositeDisposable? {
        if (compositeDisposable == null) {
            compositeDisposable = CompositeDisposable()
        }


        return compositeDisposable
    }

    protected fun addToCompositeDisposable(disposable: Disposable) {
        getCompositeDisposable()?.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable?.clear()
    }

    fun hideKeyboard() {
        val view = currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}