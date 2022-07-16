package com.example.palemprak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Dudi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dudi)

        val actionBar = supportActionBar
        actionBar!!.title = "Daftar Dunia Industri"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}