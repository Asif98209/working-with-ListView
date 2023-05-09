package com.example.myapplication11

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val our_services=findViewById<Button>(R.id.service_btn)
        val about_us=findViewById<Button>(R.id.about_us)
        val contact=findViewById<Button>(R.id.contact)

        our_services.setOnClickListener {
            val intent = Intent(this, Services::class.java)
            startActivity(intent)
        }

      about_us.setOnClickListener {
          val intent = Intent(this, aboutus::class.java)
          startActivity(intent)
      }

        contact.setOnClickListener {
            val intent = Intent(this, contactus::class.java)
            startActivity(intent)
        }
    }
}
