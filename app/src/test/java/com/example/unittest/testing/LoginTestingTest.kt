package com.example.unittest.testing

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test


internal class LoginTestingTest{


    private lateinit var login : LoginTesting

    @Before
    fun setup() {
        login = LoginTesting
    }

    @Test
    fun testUsernameEmpty() {
        val username = ""
        val result = login.validateLogin(username)
        assertEquals("Please enter username", result)
    }

    @Test
    fun testUsernameTooShort() {
        val username = "Rich"
        val result = login.validateLogin(username)
        assertEquals("Very short username", result)
    }

    @Test
    fun testUsernameTooLong() {
        val username = "Richards"
        val result = login.validateLogin(username)
        assertEquals("Very long username", result)
    }

    @Test
    fun testUsernameValid() {
        val username = "richard"
        val result = login.validateLogin(username = username)
        assertEquals("Success", result)
    }

    @Test
    fun testEmailEmpty() {
        val email = ""
        val result = login.validateLogin(email = email)
        assertEquals("Please enter email", result)
    }
}