package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CheckNameActivityViewModel(private val names: List<String>): ViewModel() {
    val input = MutableLiveData<String>()
    private val nameExist = MutableLiveData(false)
    val result = MutableLiveData<String>()

    fun checkExist() {
        this.result.value = if(names.contains(input.value)) "Name Exists" else "Name not found"
    }
}