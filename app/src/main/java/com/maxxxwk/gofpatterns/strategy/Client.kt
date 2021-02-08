package com.maxxxwk.gofpatterns.strategy

class Client {
    private val paymentManager = PaymentManager(CreditCardWallet(0))

    fun changePaymentMethod(paymentWallet: PaymentWallet) {
        paymentManager.paymentWallet = paymentWallet
    }

    fun pay(amount: Int) {
        paymentManager.pay(amount)
    }
}