
package alex.mrrok.loginapp.presentation.base

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel<R : BaseRouter<BaseActivity>> : ViewModel {

    private var compositeDisposable: CompositeDisposable? = null
    protected open var router: R? = null

    abstract fun runInjcet();

    constructor(){
        runInjcet()
    }


    fun addRouter(router: R) {
        this.router = router
    }

    fun removeRouter() {
        router = null
    }

    protected fun getCompositeDisposable(): CompositeDisposable? {
        if (compositeDisposable == null) {
            compositeDisposable = CompositeDisposable()
        }

        return compositeDisposable
    }

    protected fun addToCompositeDisposable(disposable: Disposable) {
        getCompositeDisposable()?.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable?.clear()
    }


    fun onResume() {}

    fun onPause() {}

    fun onStart() {}

    fun onStop() {}

}