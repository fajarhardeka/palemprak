package com.example.palemprak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class Menu1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        val actionBar = supportActionBar
        actionBar!!.title = "Halaman Utama"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        val btnquiz: Button = findViewById(R.id.btn2_quiz)
        btnquiz.setOnClickListener(this)

        val btnprakerin: Button = findViewById(R.id.btn2_prakerin)
        btnprakerin.setOnClickListener(this)

        val btndudi: Button = findViewById(R.id.btn2_dudi)
        btndudi.setOnClickListener(this)

        val btngallery: Button = findViewById(R.id.btn2_gallery)
        btngallery.setOnClickListener(this)

        val btnabout: Button = findViewById(R.id.btn2_about)
        btnabout.setOnClickListener(this)



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn2_quiz -> {
                val moveIntent = Intent(this@Menu1, Quiz::class.java)
                startActivity(moveIntent)
            }
            R.id.btn2_prakerin -> {
                val moveIntent = Intent(this@Menu1, Prakerin::class.java)
                startActivity(moveIntent)
            }
            R.id.btn2_dudi -> {
                val moveIntent = Intent(this@Menu1, Dudi::class.java)
                startActivity(moveIntent)
            }
            R.id.btn2_gallery -> {
                val moveIntent = Intent(this@Menu1, Gallerydudi::class.java)
                startActivity(moveIntent)
            }
            R.id.btn2_about -> {
                val moveIntent = Intent(this@Menu1, About::class.java)
                startActivity(moveIntent)
            }
        }
    }
}