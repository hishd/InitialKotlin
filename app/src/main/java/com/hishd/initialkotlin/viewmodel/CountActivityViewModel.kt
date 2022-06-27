package com.hishd.initialkotlin.viewmodel

import androidx.lifecycle.ViewModel

class CountActivityViewModel: ViewModel() {
    private var count = 0

    fun getCurrentCount() : Int {
        return this.count
    }

    fun getUpdatedCount() : Int {
        return  ++this.count
    }
}