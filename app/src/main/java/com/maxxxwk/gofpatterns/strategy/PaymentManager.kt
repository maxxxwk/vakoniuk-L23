package com.maxxxwk.gofpatterns.strategy

class PaymentManager(var paymentWallet: PaymentWallet) {
    fun pay(amount: Int) {
        paymentWallet.pay(amount)
    }
}