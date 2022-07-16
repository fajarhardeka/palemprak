package com.example.palemprak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnmenu1: Button = findViewById(R.id.button_mulai)
        btnmenu1.setOnClickListener(this)

        val btnexithalsatu: Button = findViewById(R.id.btn2_exit)
        btnexithalsatu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_mulai -> {
            val moveIntent = Intent (this@MainActivity, Menu1::class.java)
            startActivity(moveIntent)
                }
            R.id.btn2_exit -> {
                val alertDialog : AlertDialog = AlertDialog.Builder(this).create()
                alertDialog.setTitle("Exit app")
                alertDialog.setMessage("Kamu yakin keluar aplikasi?")

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ya") {
                        dialog, which ->
                    finish()
                    dialog.dismiss()

                }
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Tidak") {
                        dialog, which ->
                    dialog.dismiss()
                }
                alertDialog.show()
            }
            }
        }
}
