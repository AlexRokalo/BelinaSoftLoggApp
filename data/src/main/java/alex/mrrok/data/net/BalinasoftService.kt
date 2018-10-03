package alex.mrrok.data.net

import  alex.mrrok.data.entity.Error
import alex.mrrok.data.Internet_connection_is_not_available
import alex.mrrok.data.REST_API_URL
import alex.mrrok.data.Unknown_error
import alex.mrrok.data.entity.ErrorType
import alex.mrrok.data.entity.UserRegistration
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.Completable
import io.reactivex.CompletableSource
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class BalinasoftService : BalinasoftApi {

    private var restApi: BalinasoftApi
    private var gson: Gson
    private var loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
            .setLevel(HttpLoggingInterceptor.Level.NONE)


    private var okHttp: OkHttpClient

    @Inject constructor() {
        this.okHttp = OkHttpClient.Builder()
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build()

        this.gson = GsonBuilder()
                .setPrettyPrinting()
                .create()


        this.restApi = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(REST_API_URL)
                .client(okHttp)
                .build()
                .create(BalinasoftApi::class.java)
    }


    override fun registration(user: UserRegistration): Completable {
        return restApi.registration(user).onErrorResumeNext(this::onErrorResumeNext)
    }

    private fun onErrorResumeNext(t: Throwable): Completable {
        val error = when (t) {
            is UnknownHostException -> Error(Internet_connection_is_not_available, ErrorType.INTERNET_IS_NOT_AVAILABLE)
            else -> Error(Unknown_error, ErrorType.UNKNOWN_ERROR)
        }
        return Completable.error(error)
    }
}