package com.maxxxwk.gofpatterns.observer

fun main() {
    val oddNumberObserver = OddNumberObserver()
    val evenNumberObserver = EvenNumberObserver()
    Publisher().apply {
        addObserver(oddNumberObserver)
        addObserver(evenNumberObserver)
        updateState(123)
        updateState(1)
        updateState(2)
        removeObserver(evenNumberObserver)
        updateState(200)
        removeObserver(oddNumberObserver)
        updateState(1)
    }
}