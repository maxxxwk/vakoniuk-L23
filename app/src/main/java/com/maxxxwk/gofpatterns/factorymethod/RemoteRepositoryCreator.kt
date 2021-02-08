package com.maxxxwk.gofpatterns.factorymethod

class RemoteRepositoryCreator : RepositoryCreator {
    override fun createRepository(): Repository {
        return RemoteRepository()
    }
}