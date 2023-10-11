package com.example.myapplication.data.data_source

import com.example.myapplication.data.model.PhoneDto

interface RemoteSourceInterface {
    fun getPhoneName(): PhoneDto
}