package alex.mrrok.data.net

import alex.mrrok.data.entity.UserRegistration
import io.reactivex.Completable
import retrofit2.http.Body
import retrofit2.http.POST

interface BalinasoftApi {

    @POST("api/account/signup")
    fun registration(@Body user: UserRegistration): Completable
}