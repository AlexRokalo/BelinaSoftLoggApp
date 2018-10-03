package alex.mrrok.loginapp.executor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lalex/mrrok/loginapp/executor/UiThread;", "Lalex/mrrok/domain/executors/PostExecutionThread;", "()V", "getScheduler", "Lio/reactivex/Scheduler;", "presentation_debug"})
@javax.inject.Singleton()
public final class UiThread implements alex.mrrok.domain.executors.PostExecutionThread {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getScheduler() {
        return null;
    }
    
    @javax.inject.Inject()
    public UiThread() {
        super();
    }
}