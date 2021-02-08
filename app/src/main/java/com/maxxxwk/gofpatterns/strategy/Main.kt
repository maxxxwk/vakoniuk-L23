package com.maxxxwk.gofpatterns.strategy

fun main() {
    Client().apply {
        changePaymentMethod(CreditCardWallet(5000))
        pay(3000)
        pay(3000)
        changePaymentMethod(PayPalWallet(2000))
        pay(500)
        pay(500)
        pay(1000)
        pay(1000)
    }
}