package alex.mrrok.loginapp.app


import alex.mrrok.loginapp.injection.AppComponent
import alex.mrrok.loginapp.injection.AppModule
import alex.mrrok.loginapp.injection.DaggerAppComponent
import android.app.Application



class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()

    }

    companion object {

        var appComponent: AppComponent? = null
            private set
    }
}