package com.maxxxwk.gofpatterns.factorymethod

class LocalRepositoryCreator : RepositoryCreator {
    override fun createRepository(): Repository {
        return LocalRepository()
    }
}