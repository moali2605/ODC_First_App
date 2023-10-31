package com.example.myapplication.data.data_source

import com.example.myapplication.data.model.PhoneDto
import com.example.myapplication.data.repo.Repository
import com.example.myapplication.persent.ui.MainFactory

class PhoneApiClient : RemoteSourceInterface {
    override fun getPhoneName(): PhoneDto {
        val phoneDto = PhoneDto("s")
        return phoneDto
    }


}