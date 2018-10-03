package alex.mrrok.loginapp.presentation.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import com.android.databinding.library.baseAdapters.BR


abstract class BaseMvvmActivity<VM : BaseViewModel<BaseRouter<BaseActivity>>,
        B : ViewDataBinding, R : BaseRouter<BaseActivity>> : BaseActivity() {

    protected var viewModel: VM? = null
    protected var router: R? = null
    protected lateinit var binding: B

    /**
     * Use ViewModelProviders.of(this).get(ViewModel.class);
     */
    protected abstract fun provideViewModel(): VM

    protected abstract fun provideLayoutId(): Int

    protected abstract fun provideRouter(): R

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = provideViewModel()

        binding = DataBindingUtil.setContentView(this, provideLayoutId())


        binding.setVariable(alex.mrrok.loginapp.BR.viewModel, viewModel);

        router = provideRouter()
    }

    override fun onStart() {
        super.onStart()
        viewModel?.addRouter(router!!)
    }

    override fun onStop() {
        super.onStop()
        viewModel?.removeRouter()
    }

    override fun onResume() {
        super.onResume()
        viewModel?.onResume()
    }

    override fun onPause() {
        super.onPause()
        viewModel?.onPause()
    }

}