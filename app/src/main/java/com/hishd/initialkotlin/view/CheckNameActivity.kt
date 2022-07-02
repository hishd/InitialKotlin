package com.hishd.initialkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hishd.initialkotlin.databinding.ActivityCheckNameBinding
import com.hishd.initialkotlin.viewmodel.CheckNameActivityViewModel
import com.hishd.initialkotlin.viewmodel.CheckNameActivityViewModelFactory

class CheckNameActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityCheckNameBinding

    private val binding: ActivityCheckNameBinding by lazy {
        ActivityCheckNameBinding.inflate(layoutInflater)
    }
    private lateinit var viewModel: CheckNameActivityViewModel
    private lateinit var viewModelFactory: CheckNameActivityViewModelFactory

    private val names: List<String> by lazy {
        listOf("Imasha", "Hishara", "Nimesh", "Madola", "Ashan", "Tiny")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityCheckNameBinding.inflate(layoutInflater);
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        viewModelFactory = CheckNameActivityViewModelFactory(names = this.names)
        viewModel = ViewModelProvider(this, viewModelFactory)[CheckNameActivityViewModel::class.java]
    }
}