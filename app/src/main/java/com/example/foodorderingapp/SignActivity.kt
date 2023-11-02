 package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderingapp.databinding.ActivitySignBinding

 class SignActivity : AppCompatActivity() {
    private val binding : ActivitySignBinding by lazy {
        ActivitySignBinding.inflate(layoutInflater)
    }
     
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alreadyHaveButton.setOnClickListener {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        binding.createAcButton.setOnClickListener {
            startActivity(Intent(this,ChooseLocationActivity::class.java))
        }
    }
}             