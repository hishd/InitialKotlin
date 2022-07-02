package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlusActivityViewModel(sum: Int) : ViewModel() {

    private var sum = MutableLiveData<Int>()
    val totalSum: LiveData<Int> get() = sum

    //Tow way binding variable
    val input = MutableLiveData<String>()

    init {
        this.sum.value = sum
    }

    fun getCalculatedSum() {
        input.value?.let {
            sum.value = sum.value?.plus(it.toInt())
        }
    }
}