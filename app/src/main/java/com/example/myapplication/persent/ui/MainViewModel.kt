package com.example.myapplication.persent.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repo.Repository
import com.example.myapplication.domain.usecase.PhoneUseCase
import com.example.myapplication.persent.model.PhoneModel
import com.example.myapplication.persent.model.toDomainModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(val repository: Repository) : ViewModel() {
    //val phoneStateFlow: MutableStateFlow<PhoneModel> = MutableStateFlow(PhoneModel(1))
    val phoneMutableLiveData:MutableLiveData<PhoneModel> = MutableLiveData()
    fun getBrandName() {
        viewModelScope.launch(Dispatchers.IO) {
            val result =repository.getPhoneName()
            withContext(Dispatchers.Main) {
                //phoneStateFlow.value = result.toDomainModel()
                phoneMutableLiveData.value=result.toDomainModel()
            }
        }
    }

    init {
        getBrandName()
    }
}