package alex.mrrok.loginapp.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lalex/mrrok/loginapp/injection/AppModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideContext", "providePostExecutionThread", "Lalex/mrrok/domain/executors/PostExecutionThread;", "uiThread", "Lalex/mrrok/loginapp/executor/UiThread;", "provideRepository", "Lalex/mrrok/domain/repository/Repository;", "restService", "Lalex/mrrok/data/net/BalinasoftService;", "presentation_debug"})
@dagger.Module()
public final class AppModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final alex.mrrok.domain.executors.PostExecutionThread providePostExecutionThread(@org.jetbrains.annotations.NotNull()
    alex.mrrok.loginapp.executor.UiThread uiThread) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final alex.mrrok.domain.repository.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    alex.mrrok.data.net.BalinasoftService restService) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}