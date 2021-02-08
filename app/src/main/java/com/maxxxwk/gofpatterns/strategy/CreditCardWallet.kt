package com.maxxxwk.gofpatterns.strategy

class CreditCardWallet(var balance: Int) : PaymentWallet {
    override fun pay(amount: Int) {
        if (amount > balance) {
            println("Not enough!")
        } else {
            balance -= amount
            println("$amount paid from credit card")
        }
    }
}