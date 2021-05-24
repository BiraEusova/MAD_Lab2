package com.example.laba2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.registrationButton
import kotlinx.android.synthetic.main.regisration_activity.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regisration_activity)

        registrationButton.setOnClickListener{
            val intent = Intent(this, CreateGarden::class.java)
            startActivity(intent)
        }
        alreadyHaveButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}