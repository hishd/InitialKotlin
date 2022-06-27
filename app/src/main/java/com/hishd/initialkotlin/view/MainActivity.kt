package com.hishd.initialkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hishd.initialkotlin.model.Student
import com.hishd.initialkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(id = 1, name = "Hishara", email = "hishara@gmail.com")
    }
}