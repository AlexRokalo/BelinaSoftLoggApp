package alex.mrrok.loginapp.executor

import alex.mrrok.domain.executors.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UiThread @Inject constructor()  : PostExecutionThread {

    override fun getScheduler(): Scheduler = AndroidSchedulers.mainThread()
}