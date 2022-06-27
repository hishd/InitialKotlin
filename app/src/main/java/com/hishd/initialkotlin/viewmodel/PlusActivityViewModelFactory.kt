package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class PlusActivityViewModelFactory(private var sum: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PlusActivityViewModel::class.java)) {
            return PlusActivityViewModel(sum = sum) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class found")
    }
}