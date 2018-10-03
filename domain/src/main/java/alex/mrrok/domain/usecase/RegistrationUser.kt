package alex.mrrok.domain.usecase

import alex.mrrok.domain.entity.RegistrationInfo
import alex.mrrok.domain.executors.PostExecutionThread
import alex.mrrok.domain.repository.Repository
import android.util.Log
import io.reactivex.Completable
import javax.inject.Inject

class RegistrationUser @Inject constructor(private var repository: Repository, postExecutionThread: PostExecutionThread) :
        BaseUseCase(postExecutionThread) {

    fun regist(login: String, password: String): Completable {
        var name = login.split("@")
        return repository
                .registration(RegistrationInfo(name[0], password))
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }

}