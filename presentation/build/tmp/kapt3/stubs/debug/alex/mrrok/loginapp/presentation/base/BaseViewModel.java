package alex.mrrok.loginapp.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0004J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u000fH&R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0094\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lalex/mrrok/loginapp/presentation/base/BaseViewModel;", "R", "Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "Lalex/mrrok/loginapp/presentation/base/BaseActivity;", "Landroid/arch/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "router", "getRouter", "()Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "setRouter", "(Lalex/mrrok/loginapp/presentation/base/BaseRouter;)V", "Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "addRouter", "", "addToCompositeDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "getCompositeDisposable", "onCleared", "onPause", "onResume", "onStart", "onStop", "removeRouter", "runInjcet", "presentation_debug"})
public abstract class BaseViewModel<R extends alex.mrrok.loginapp.presentation.base.BaseRouter<alex.mrrok.loginapp.presentation.base.BaseActivity>> extends android.arch.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    @org.jetbrains.annotations.Nullable()
    private R router;
    
    @org.jetbrains.annotations.Nullable()
    protected R getRouter() {
        return null;
    }
    
    protected void setRouter(@org.jetbrains.annotations.Nullable()
    R p0) {
    }
    
    public abstract void runInjcet();
    
    public final void addRouter(@org.jetbrains.annotations.NotNull()
    R router) {
    }
    
    public final void removeRouter() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    protected final void addToCompositeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onResume() {
    }
    
    public final void onPause() {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
    
    public BaseViewModel() {
        super();
    }
}