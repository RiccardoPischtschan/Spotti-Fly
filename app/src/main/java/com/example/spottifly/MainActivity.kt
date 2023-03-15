package com.example.spottifly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spottifly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sucheButton.setOnClickListener {
            val sucheFragment = Suche_Fragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, sucheFragment).commit()
        }
        binding.homeButton.setOnClickListener {
            val homeFragment = Home_Fragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, homeFragment).commit()
        }
    }
}
