package com.maxxxwk.gofpatterns.observer

class Publisher {
    private var state = 0
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun updateState(state: Int) {
        this.state = state
        observers.forEach {
            it.onUpdate(this.state)
        }
    }

}