package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CheckNameActivityViewModelFactory(private val names: List<String>): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CheckNameActivityViewModel::class.java)) {
            return CheckNameActivityViewModel(names = this.names) as T
        }

        throw IllegalArgumentException("Could not find a matching ViewModel")
    }
}