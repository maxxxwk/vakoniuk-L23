package com.maxxxwk.gofpatterns.strategy

class PayPalWallet(var balance: Int) : PaymentWallet {
    override fun pay(amount: Int) {
        if (amount > balance) {
            println("Not enough!")
        } else {
            balance -= amount
            println("$amount paid from PayPal")
        }
    }
}