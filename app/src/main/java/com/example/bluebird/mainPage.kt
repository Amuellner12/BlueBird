package com.example.bluebird

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)



        Intent(this@mainPage, FinalPage::class.java).also {
            startActivity(it)
        }
    }
    }
