package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel

class PlusActivityViewModel(private var sum: Int): ViewModel() {

    fun getCurrentSum() : Int {
        return this.sum
    }

    fun getCalculatedSum(amount: Int) : Int {
        this.sum+=amount
        return  this.sum
    }
}