package com.maxxxwk.gofpatterns.observer

class EvenNumberObserver:Observer {
    override fun onUpdate(state: Int) {
        if (state % 2 == 0) {
            println("$state is even number")
        }
    }
}