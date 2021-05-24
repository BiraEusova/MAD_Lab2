package com.example.laba2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.create_garden_activity.*

class CreateGarden : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_garden_activity)

        doneButton.setOnClickListener{
            val intent = Intent(this, BottomNavigationActivity::class.java)
            startActivity(intent)
        }

    }
}
