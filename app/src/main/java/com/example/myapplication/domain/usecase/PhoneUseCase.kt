package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.model.PhoneDomainModel
import com.example.myapplication.domain.repo.PhoneRepositoryInterface

class PhoneUseCase(val mobileRepo: PhoneRepositoryInterface) {

   suspend  fun execute(): PhoneDomainModel = mobileRepo.getPhoneName()
}