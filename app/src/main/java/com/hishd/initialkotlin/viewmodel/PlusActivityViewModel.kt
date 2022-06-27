package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlusActivityViewModel(sum: Int) : ViewModel() {

    private var sum = MutableLiveData<Int>()
    val totalSum: LiveData<Int> get() = sum

    init {
        this.sum.value = sum
    }

    fun getCalculatedSum(amount: Int) {
        this.sum.value = this.sum.value?.plus(amount)
    }
}