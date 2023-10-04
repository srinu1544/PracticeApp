package com.example.practiceapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class QuotsViewModel : ViewModel() {

    val quots :  LiveData<List<String>> = MutableLiveData()


    init {
        viewModelScope.launch {

            launch {  }
        }
    }



}