package com.example.unittest.testing

object RegistrationTesting {
    private val existingUsers = listOf("Peter", "Carl", "Richard")
    private val existingEmail = listOf("peter@gmail.com","carl@gmail.com","richard@gmail.com")

    fun validateRegistrationInput(
        username : String,
        email : String,
        password : String,
        confirmedPassword : String
    ) : Boolean{
        if(username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        when{
            username in existingUsers -> return false
            email in existingEmail -> return false
            password != confirmedPassword -> return false
            password.length < 6 -> return false
            password.length > 50 -> return false
            password.filter { it.isUpperCase()}.isEmpty() -> return false
            password.filter { it.isLowerCase()}.isEmpty() -> return false
//            password.filter { it.isUpperCase()}.isEmpty() -> return false
            password.count { it.isDigit() } < 2 -> return false
        }
        return true
    }
}