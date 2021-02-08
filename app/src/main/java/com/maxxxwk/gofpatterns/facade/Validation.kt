package com.maxxxwk.gofpatterns.facade

class Validation {
    private val passwordValidator = PasswordValidator()

    fun validatePassword(password: String) = when {
        passwordValidator.checkMinLength(password) -> "Password too short"
        passwordValidator.checkMaxLength(password) -> "Password too long"
        !passwordValidator.hasUpperAndLowerCaseSymbols(password) -> "Password should contain upper case and lower case"
        !passwordValidator.hasDigits(password) -> "Password should contain digits"
        else -> "Correct password"
    }
}