package com.example.palemprak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val actionBar = supportActionBar
        actionBar!!.title = "Quiz"

        // Atur nama dan ucapan pada hasil
        tvNameResult.text = "Selamat! $name"
        tvScore.text = "Nilai kamu adalah $score/${getQuizoner().size}"

        btnFinish.setOnClickListener {
            // Reset hasil ketika selesai
            score = 0

            // Go to Quizoner Page
            startActivity(
                Intent(
                    this,
                    Quiz::class.java,
                )
            )

        }

    }
}