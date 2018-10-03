package alex.mrrok.loginapp.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0004J\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lalex/mrrok/loginapp/presentation/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "addToCompositeDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "getCompositeDisposable", "hideKeyboard", "onDestroy", "presentation_debug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    protected final void addToCompositeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void hideKeyboard() {
    }
    
    public BaseActivity() {
        super();
    }
}