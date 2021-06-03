package com.eziz.dersler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()
            Toast.makeText(
                applicationContext,
                "Username : $username ,Password: $password",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}