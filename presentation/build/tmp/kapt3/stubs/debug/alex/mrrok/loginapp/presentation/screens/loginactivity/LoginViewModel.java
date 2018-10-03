package alex.mrrok.loginapp.presentation.screens.loginactivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020 J\b\u0010!\u001a\u00020\u001fH\u0016J\u0006\u0010\"\u001a\u00020#R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006$"}, d2 = {"Lalex/mrrok/loginapp/presentation/screens/loginactivity/LoginViewModel;", "Lalex/mrrok/loginapp/presentation/base/BaseViewModel;", "Lalex/mrrok/loginapp/presentation/base/BaseRouter;", "Lalex/mrrok/loginapp/presentation/base/BaseActivity;", "()V", "email", "Landroid/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getEmail", "()Landroid/databinding/ObservableField;", "setEmail", "(Landroid/databinding/ObservableField;)V", "emailText", "Landroid/widget/EditText;", "getEmailText", "setEmailText", "password", "getPassword", "setPassword", "passwordText", "getPasswordText", "setPasswordText", "<set-?>", "Lalex/mrrok/domain/usecase/RegistrationUser;", "registry", "getRegistry", "()Lalex/mrrok/domain/usecase/RegistrationUser;", "setRegistry", "(Lalex/mrrok/domain/usecase/RegistrationUser;)V", "error", "", "", "runInjcet", "validate", "", "presentation_debug"})
public final class LoginViewModel extends alex.mrrok.loginapp.presentation.base.BaseViewModel<alex.mrrok.loginapp.presentation.base.BaseRouter<alex.mrrok.loginapp.presentation.base.BaseActivity>> {
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> email;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> password;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<android.widget.EditText> emailText;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<android.widget.EditText> passwordText;
    @org.jetbrains.annotations.NotNull()
    public alex.mrrok.domain.usecase.RegistrationUser registry;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<android.widget.EditText> getEmailText() {
        return null;
    }
    
    public final void setEmailText(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<android.widget.EditText> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<android.widget.EditText> getPasswordText() {
        return null;
    }
    
    public final void setPasswordText(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<android.widget.EditText> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final alex.mrrok.domain.usecase.RegistrationUser getRegistry() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setRegistry(@org.jetbrains.annotations.NotNull()
    alex.mrrok.domain.usecase.RegistrationUser p0) {
    }
    
    public final boolean validate() {
        return false;
    }
    
    public final void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void runInjcet() {
    }
    
    public LoginViewModel() {
        super();
    }
}