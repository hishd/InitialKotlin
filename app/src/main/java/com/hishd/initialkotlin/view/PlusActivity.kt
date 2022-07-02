package com.hishd.initialkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hishd.initialkotlin.databinding.ActivityPlusBinding
import com.hishd.initialkotlin.viewmodel.PlusActivityViewModel
import com.hishd.initialkotlin.viewmodel.PlusActivityViewModelFactory

class PlusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlusBinding
    private lateinit var viewModel: PlusActivityViewModel
    private lateinit var viewModelFactory: PlusActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlusBinding.inflate(layoutInflater);
        setContentView(binding.root)

        viewModelFactory = PlusActivityViewModelFactory(sum = 100)
        viewModel = ViewModelProvider(this, viewModelFactory)[PlusActivityViewModel::class.java]

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

//        viewModel.totalSum.observe(this) {
//            binding.lblSum.text = it.toString()
//        }
//
//        binding.apply {
//            btnAdd.setOnClickListener {
//                viewModel.getCalculatedSum(txtAmount.text.toString().toInt())
//            }
//        }
    }
}