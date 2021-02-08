package com.maxxxwk.gofpatterns.observer

class OddNumberObserver : Observer {
    override fun onUpdate(state: Int) {
        if (state % 2 != 0) {
            println("$state is odd number")
        }
    }
}