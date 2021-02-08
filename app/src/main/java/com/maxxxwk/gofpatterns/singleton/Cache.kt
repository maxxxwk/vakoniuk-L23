package com.maxxxwk.gofpatterns.singleton

class Cache private constructor() {
    fun putData(data: Any?) {
        println("caching of data")
    }

    companion object {
        private var instance: Cache? = null

        fun getInstance(): Cache {
            return instance ?: Cache().also {
                instance = it
            }
        }
    }
}