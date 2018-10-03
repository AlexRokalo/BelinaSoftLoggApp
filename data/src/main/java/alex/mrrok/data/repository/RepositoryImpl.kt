package alex.mrrok.data.repository

import alex.mrrok.data.entity.UserRegistration
import alex.mrrok.data.net.BalinasoftApi
import alex.mrrok.domain.entity.RegistrationInfo
import alex.mrrok.domain.repository.Repository
import io.reactivex.Completable
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val restService: BalinasoftApi) : Repository {


    override fun registration(user: RegistrationInfo): Completable {
        val user: UserRegistration = UserRegistration(user.login, user.password)
        return restService.registration(user = user)
    }
}