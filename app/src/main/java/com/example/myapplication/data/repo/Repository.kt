package com.example.myapplication.data.repo

import com.example.myapplication.data.data_source.RemoteSourceInterface
import com.example.myapplication.data.mapper.toDomainModel
import com.example.myapplication.domain.model.PhoneDomainModel
import com.example.myapplication.domain.repo.PhoneRepositoryInterface

class Repository(val remoteSourceInterface: RemoteSourceInterface):PhoneRepositoryInterface {

    override suspend fun getPhoneName(): PhoneDomainModel {
        return remoteSourceInterface.getPhoneName().toDomainModel()
    }

}