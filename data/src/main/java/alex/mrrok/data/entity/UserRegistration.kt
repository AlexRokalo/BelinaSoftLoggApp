package alex.mrrok.data.entity

import com.google.gson.annotations.SerializedName

data class UserRegistration(var login: String,
                            var password: String) : DataModel {}