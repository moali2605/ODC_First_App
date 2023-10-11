package com.example.myapplication.persent.model

import com.example.myapplication.R
import com.example.myapplication.domain.model.PhoneDomainModel

fun PhoneDomainModel.toDomainModel(): PhoneModel {
    return PhoneModel(
        when (this.brandName) {
            PhoneEnum.IPHONE.phone -> R.string.iphone
            PhoneEnum.SAMSUNG.phone -> R.string.samsung
            else -> -1
        }
    )
}