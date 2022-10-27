package com.example.unittest.testing

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertFalse
import org.junit.Before
import org.junit.Test


internal class RegistrationTestingTest{
    private lateinit var regis : RegistrationTesting

    @Before
    fun setUp(){
        regis = RegistrationTesting
    }

    @Test
    fun valid_registration(){
        val result = regis.validateRegistrationInput("Kuproy","royy@gmail.com","roy","roy")
        assertEquals(true,result)
    }

    @Test
    fun empty_username_false(){
        val result = regis.validateRegistrationInput(
            username = "",
            email = "testing",
            password = "testing",
            confirmedPassword = "testing")
        assertEquals(result, false)
    }

    @Test
    fun empty_email_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "",
            password = "testing",
            confirmedPassword = "testing")
        assertEquals(result, false)
    }

    @Test
    fun empty_password_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "",
            confirmedPassword = "testing")
        assertEquals(result, false)
    }

    @Test
    fun empty_confirmedPassword_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "testing",
            confirmedPassword = "")
        assertEquals(result, false)
    }

    @Test
    fun empty_username_true(){
        val result = regis.validateRegistrationInput(
            username = "",
            email = "testing",
            password = "testing",
            confirmedPassword = "testing")
        assertEquals(true,result)
    }

    @Test
    fun empty_email_true(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "",
            password = "testing",
            confirmedPassword = "testing")
        assertEquals(true,result)
    }

    @Test
    fun empty_password_true(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "",
            confirmedPassword = "testing")
        assertEquals(true,result)
    }

    @Test
    fun empty_confirmedPassword_true(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "testing",
            confirmedPassword = "")
        assertEquals(true,result)
    }

    @Test
    fun exisiting_username_false(){
        val result = regis.validateRegistrationInput(
            username = "Peter",
            email = "testing",
            password = "testing",
            confirmedPassword = "testing")
        assertEquals(false,result)
    }

    @Test
    fun exisiting_email_false() {
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "peter@gmail.com",
            password = "testing",
            confirmedPassword = "testing"
        )
        assertFalse(result)
    }

    @Test
    fun password_less_than_6_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "not",
            confirmedPassword = "not")
        assertFalse(result)
    }

    @Test
    fun password_more_than_50_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "angkaramessingangkaramessingangkaramessingangkaramessingangkaramessingangkaramessing",
            confirmedPassword = "angkaramessingangkaramessingangkaramessingangkaramessingangkaramessingangkaramessing")
        assertFalse(result)
    }

    @Test
    fun password_not_contain_uppercase_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "angkaramessi",
            confirmedPassword = "messi")
        assertFalse(result)
    }

    @Test
    fun password_not_contain_lowercase_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "ANGKARAMESSI",
            confirmedPassword = "MESSI")
        assertFalse(result)
    }

    @Test
    fun password_digit_less_than_2_false(){
        val result = regis.validateRegistrationInput(
            username = "testing",
            email = "testing",
            password = "ABABABAB",
            confirmedPassword = "ABABABAB")
        assertFalse(result)
    }
}