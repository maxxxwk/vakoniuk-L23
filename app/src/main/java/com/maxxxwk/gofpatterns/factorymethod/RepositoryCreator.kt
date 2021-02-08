package com.maxxxwk.gofpatterns.factorymethod

interface RepositoryCreator {
    fun createRepository(): Repository
}