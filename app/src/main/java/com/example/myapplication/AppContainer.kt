package com.example.myapplication

import com.example.myapplication.data.data_source.PhoneApiClient
import com.example.myapplication.data.repo.Repository
import com.example.myapplication.persent.ui.MainFactory

class AppContainer {
    val remoteSourceInterface=PhoneApiClient()
    val repository= Repository(remoteSourceInterface)
    val mainFactory= MainFactory(repository)
}