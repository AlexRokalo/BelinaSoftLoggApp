package alex.mrrok.loginapp.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lalex/mrrok/loginapp/app/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "presentation_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static alex.mrrok.loginapp.injection.AppComponent appComponent;
    public static final alex.mrrok.loginapp.app.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lalex/mrrok/loginapp/app/App$Companion;", "", "()V", "<set-?>", "Lalex/mrrok/loginapp/injection/AppComponent;", "appComponent", "getAppComponent", "()Lalex/mrrok/loginapp/injection/AppComponent;", "setAppComponent", "(Lalex/mrrok/loginapp/injection/AppComponent;)V", "presentation_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final alex.mrrok.loginapp.injection.AppComponent getAppComponent() {
            return null;
        }
        
        private final void setAppComponent(alex.mrrok.loginapp.injection.AppComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}