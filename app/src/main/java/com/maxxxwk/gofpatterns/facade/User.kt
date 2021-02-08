package com.maxxxwk.gofpatterns.facade

class User {
    fun setPassword(password: String){
        println(Validation().validatePassword(password))
    }
}