package com.example.anop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class NotifikasiActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi2)

        val btnNotifikasi1 = findViewById<AppCompatButton>(R.id.notifikasi_btn8)

        btnNotifikasi1.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val btnNotifikasi2 = findViewById<AppCompatButton>(R.id.notifikasi_btn7)

        btnNotifikasi2.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val btnNotifikasi3 = findViewById<AppCompatButton>(R.id.notifikasi_btn14)

        btnNotifikasi3.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val btnNotifikasi4 = findViewById<AppCompatButton>(R.id.notifikasi_btn9)

        btnNotifikasi4.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }


        val btnNotifikasi7 = findViewById<AppCompatButton>(R.id.notifikasi_btn12)

        btnNotifikasi7.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }

        val btnNotifikasi5 = findViewById<AppCompatButton>(R.id.notifikasi_btn10)

        btnNotifikasi5.setOnClickListener {
            val intent = Intent(this, NotifikasiActivity::class.java)
            startActivity(intent)
        }
    }
}