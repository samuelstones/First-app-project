package com.example.vibe2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var logbtn:Button
    private lateinit var regbtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edtMainname)
        email = findViewById(R.id.edtMainEmail)
        password = findViewById(R.id.edtMainPassword)
        logbtn = findViewById(R.id.edtmainlogbtn)
        regbtn = findViewById(R.id.edtmainregbtn)


        logbtn.setOnClickListener {
            Toast.makeText(this, "login", Toast.LENGTH_SHORT).show()
        }


    }
}