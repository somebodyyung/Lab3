package com.example.lab3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplicit1 = findViewById<Button>(R.id.button2)
        btnExplicit1.setOnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        val btnImplicit = findViewById<Button>(R.id.button3)
        btnImplicit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.kz/?hl=ru")
            startActivity(intent)
        }

        val btnExplicit2 = findViewById<Button>(R.id.button4)
        btnExplicit2.setOnClickListener {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }
    }
}