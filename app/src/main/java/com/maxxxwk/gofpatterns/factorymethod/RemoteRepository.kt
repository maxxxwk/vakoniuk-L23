package com.maxxxwk.gofpatterns.factorymethod

class RemoteRepository : Repository {
    override fun getData(): Any? {
        println("Remote repository return data")
        return null //Here should be some data
    }
}