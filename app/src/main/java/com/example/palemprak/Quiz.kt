package com.example.palemprak


import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_quiz.*

var name = ""


class Quiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val actionBar = supportActionBar
        actionBar!!.title = "Quiz"
        val cd = ColorDrawable(Color.parseColor("#FF3700B3"))
        actionBar.setBackgroundDrawable(cd)

        btnMulaiQuiz.setOnClickListener {
            if (tvName.text.toString().isEmpty()) {
                tvNameParent.error = "Harap isi nama kamu!"
            } else {
                name = tvName.text.toString()
                startActivity(
                    Intent(
                        this,
                        QuizonerActivity::class.java
                    )
                )
            }
        }
    }
}