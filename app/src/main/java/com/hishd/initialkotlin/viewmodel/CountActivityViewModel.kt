package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountActivityViewModel(initialCount: Int): ViewModel() {
    private var count = MutableLiveData<Int>()
    val totalCount: LiveData<Int> get() = count

    init {
        this.count.value = initialCount
    }

    fun getUpdatedCount() {
        this.count.value = this.count.value?.plus(1)
    }
}