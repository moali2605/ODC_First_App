package com.example.myapplication.domain.repo

import com.example.myapplication.domain.model.PhoneDomainModel

interface PhoneRepositoryInterface {
    suspend fun getPhoneName():PhoneDomainModel
}