package com.example.myapplication.persent.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.usecase.PhoneUseCase
import com.example.myapplication.persent.model.PhoneModel
import com.example.myapplication.persent.model.toDomainModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val useCase: PhoneUseCase) : ViewModel() {
    val phoneStateFlow: MutableStateFlow<PhoneModel> = MutableStateFlow(PhoneModel(""))
    fun getBrandName() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = useCase.mobileRepo.getPhoneName()
            withContext(Dispatchers.Main) {
                phoneStateFlow.value = result.toDomainModel()
            }
        }
    }

    init {
        getBrandName()
    }
}