package com.example.myapplication.data.mapper

import com.example.myapplication.data.model.PhoneDto
import com.example.myapplication.domain.model.PhoneDomainModel

fun PhoneDto.toDomainModel():PhoneDomainModel{
    return PhoneDomainModel(brandName = this.brandName?:"")
}