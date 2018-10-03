package alex.mrrok.data.entity



class Error(override val message: String,
            val errorType: ErrorType) : Exception(message) {

}