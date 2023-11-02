package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderingapp.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
         }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
           startActivity(Intent(this, SignActivity::class.java))
        }

        binding.dontHaveButton.setOnClickListener {
           startActivity(Intent(this, SignActivity::class.java))
        }




    }
}