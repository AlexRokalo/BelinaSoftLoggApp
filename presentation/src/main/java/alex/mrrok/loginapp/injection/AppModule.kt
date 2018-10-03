package alex.mrrok.loginapp.injection



import alex.mrrok.data.net.BalinasoftService
import alex.mrrok.data.repository.RepositoryImpl
import alex.mrrok.domain.executors.PostExecutionThread
import alex.mrrok.domain.repository.Repository
import alex.mrrok.loginapp.executor.UiThread
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val context: Context) {


    @Singleton
    @Provides
    fun provideContext() = context

    @Singleton
    @Provides
    fun providePostExecutionThread(uiThread: UiThread): PostExecutionThread = uiThread

    @Singleton
    @Provides
    fun provideRepository(restService: BalinasoftService) : Repository =
            RepositoryImpl(restService)

}