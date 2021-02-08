package com.maxxxwk.gofpatterns.facade

class PasswordValidator {
    companion object {
        private const val MIN_LENGTH = 8
        private const val MAX_LENGTH = 48
    }

    fun checkMinLength(password: String) = password.length < MIN_LENGTH
    fun checkMaxLength(password: String) = password.length > MAX_LENGTH
    fun hasUpperAndLowerCaseSymbols(password: String) =
        (password.toUpperCase() != password) && (password.toLowerCase() != password)

    fun hasDigits(password: String) = password.contains(Regex("[0-9]+"))
}