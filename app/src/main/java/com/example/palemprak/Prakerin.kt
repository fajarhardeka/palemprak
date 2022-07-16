package com.example.palemprak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Prakerin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prakerin)

        val actionBar = supportActionBar
        actionBar!!.title = "Pengertian Prakerin"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}