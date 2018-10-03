package alex.mrrok.domain.repository

import alex.mrrok.domain.entity.RegistrationInfo
import io.reactivex.Completable

interface Repository {

    fun registration(user: RegistrationInfo): Completable
}