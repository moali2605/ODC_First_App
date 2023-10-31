package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.data_source.PhoneApiClient

class MyApplication:Application() {

    val appContainer=AppContainer()
}