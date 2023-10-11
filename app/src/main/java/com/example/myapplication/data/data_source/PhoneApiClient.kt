package com.example.myapplication.data.data_source

import com.example.myapplication.data.model.PhoneDto

class PhoneApiClient : RemoteSourceInterface {
    override fun getPhoneName(): PhoneDto {
        val phoneDto = PhoneDto("s")
        return phoneDto
    }
}