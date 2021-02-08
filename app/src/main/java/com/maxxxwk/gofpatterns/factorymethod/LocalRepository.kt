package com.maxxxwk.gofpatterns.factorymethod

class LocalRepository : Repository {
    override fun getData(): Any? {
        println("Local repository return data")
        return null //Here should be some data
    }
}