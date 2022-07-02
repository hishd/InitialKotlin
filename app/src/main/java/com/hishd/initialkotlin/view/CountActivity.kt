package com.hishd.initialkotlin.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hishd.initialkotlin.databinding.ActivityCountBinding
import com.hishd.initialkotlin.viewmodel.CountActivityViewModel
import com.hishd.initialkotlin.viewmodel.CountActivityViewModelFactory

class CountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountBinding
    private lateinit var viewModel: CountActivityViewModel
    private lateinit var viewModelFactory: CountActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountBinding.inflate(layoutInflater);
        setContentView(binding.root)

        viewModelFactory = CountActivityViewModelFactory(initialCount = 10)
        viewModel = ViewModelProvider(this, viewModelFactory)[CountActivityViewModel::class.java]

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

//        viewModel.totalCount.observe(this) {
//            binding.lblCount.text = it.toString()
//        }

//        binding.apply {
//            btnCountIncrement.setOnClickListener{
//                viewModel.getUpdatedCount()
//            }
//        }
    }
}