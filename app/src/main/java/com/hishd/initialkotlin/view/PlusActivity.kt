package com.hishd.initialkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hishd.initialkotlin.databinding.ActivityMainBinding
import com.hishd.initialkotlin.databinding.ActivityPlusBinding
import com.hishd.initialkotlin.viewmodel.PlusActivityViewModel
import com.hishd.initialkotlin.viewmodel.PlusActivityViewModelFactory
import java.util.*

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

        binding.apply {
            lblSum.text = viewModel.getCurrentSum().toString()

            btnAdd.setOnClickListener {
                lblSum.text = String.format(Locale.ENGLISH, "Sum is : %d", viewModel.getCalculatedSum(txtAmount.text.toString().toInt()))
            }
        }
    }
}