package alex.mrrok.domain.usecase

import alex.mrrok.domain.executors.ExecutionThread
import alex.mrrok.domain.executors.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

open class BaseUseCase {
    protected var executionThread: Scheduler
    protected var postExecutionThread: Scheduler

    constructor(executionThread: Scheduler, postExecutionThread: Scheduler) {
        this.executionThread = executionThread
        this.postExecutionThread = postExecutionThread
    }

    constructor(executionThread: ExecutionThread, postExecutionThread: PostExecutionThread) {
        this.executionThread = Schedulers.from(executionThread)
        this.postExecutionThread = postExecutionThread.getScheduler()
    }

    constructor(postExecutionThread: PostExecutionThread) {
        this.executionThread = Schedulers.io()
        this.postExecutionThread = postExecutionThread.getScheduler()
    }

}