package com.maxxxwk.gofpatterns.factorymethod


fun main(){
    val localRepository = LocalRepositoryCreator().createRepository()
    val remoteRepository = RemoteRepositoryCreator().createRepository()
    val dataFromLocalRepository = localRepository.getData()
    val dataFromRemoteRepository = remoteRepository.getData()
}