package com.hishd.initialkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hishd.initialkotlin.databinding.ActivityCountBinding
import com.hishd.initialkotlin.viewmodel.CountActivityViewModel

class CountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountBinding
    private lateinit var viewModel: CountActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountBinding.inflate(layoutInflater);
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[CountActivityViewModel::class.java]

        binding.apply {
            lblCount.text = viewModel.getCurrentCount().toString()
            btnCountIncrement.setOnClickListener{
                lblCount.text = viewModel.getUpdatedCount().toString()
            }
        }
    }
}