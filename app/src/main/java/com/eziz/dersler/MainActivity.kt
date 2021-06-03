package com.eziz.dersler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSee = Button(this)
        buttonSee.setText(R.string.btnName)
        buttonSee.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        rootContainer?.addView(buttonSee)
        buttonSee.setOnClickListener {
            val mesaj = resources.getString(R.string.mesaj)
            Toast.makeText(this, mesaj, Toast.LENGTH_LONG).show()

            val editText1 = EditText(this)
            editText1.setText(R.string.text)
            editText1.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            rootContainer?.addView(editText1)
        }

    }
}