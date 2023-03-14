package com.example.spottifly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spottifly.Adapter.PostAdapter
import com.example.spottifly.Model.Repository
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

}