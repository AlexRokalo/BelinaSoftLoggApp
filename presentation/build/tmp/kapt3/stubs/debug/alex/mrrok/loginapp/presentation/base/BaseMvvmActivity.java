package alex.mrrok.loginapp.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002*\b\b\u0001\u0010\u0005*\u00020\u0006*\u000e\b\u0002\u0010\u0007*\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\b\u0010#\u001a\u00020$H$J\r\u0010%\u001a\u00028\u0002H$\u00a2\u0006\u0002\u0010\u0011J\r\u0010&\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0017R\u001c\u0010\t\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0002X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lalex/mrrok/loginapp/presentation/base/BaseMvvmActivity;", "VM", "Lalex/mrrok/loginapp/presentation/base/BaseViewModel;", "Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "Lalex/mrrok/loginapp/presentation/base/BaseActivity;", "B", "Landroid/databinding/ViewDataBinding;", "R", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "router", "getRouter", "()Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "setRouter", "(Lalex/mrrok/loginapp/presentation/base/BaseRouter;)V", "Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "viewModel", "getViewModel", "()Lalex/mrrok/loginapp/presentation/base/BaseViewModel;", "setViewModel", "(Lalex/mrrok/loginapp/presentation/base/BaseViewModel;)V", "Lalex/mrrok/loginapp/presentation/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "provideLayoutId", "", "provideRouter", "provideViewModel", "presentation_debug"})
public abstract class BaseMvvmActivity<VM extends alex.mrrok.loginapp.presentation.base.BaseViewModel<alex.mrrok.loginapp.presentation.base.BaseRouter<alex.mrrok.loginapp.presentation.base.BaseActivity>>, B extends android.databinding.ViewDataBinding, R extends alex.mrrok.loginapp.presentation.base.BaseRouter<alex.mrrok.loginapp.presentation.base.BaseActivity>> extends alex.mrrok.loginapp.presentation.base.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private VM viewModel;
    @org.jetbrains.annotations.Nullable()
    private R router;
    @org.jetbrains.annotations.NotNull()
    protected B binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.Nullable()
    VM p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final R getRouter() {
        return null;
    }
    
    protected final void setRouter(@org.jetbrains.annotations.Nullable()
    R p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    /**
     * * Use ViewModelProviders.of(this).get(ViewModel.class);
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract VM provideViewModel();
    
    protected abstract int provideLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract R provideRouter();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public BaseMvvmActivity() {
        super();
    }
}