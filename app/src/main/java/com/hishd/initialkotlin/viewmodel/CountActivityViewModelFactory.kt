package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CountActivityViewModelFactory(private val initialCount: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CountActivityViewModel::class.java))
            return CountActivityViewModel(initialCount = initialCount) as T

        throw IllegalArgumentException("No match found for ViewModel class.")
    }
}