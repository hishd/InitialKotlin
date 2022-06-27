package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel

class PlusActivityViewModel: ViewModel() {
    private var sum = 0

    fun getCurrentSum() : Int {
        return this.sum
    }

    fun getCalculatedSum(amount: Int) : Int {
        this.sum+=amount
        return  this.sum
    }
}