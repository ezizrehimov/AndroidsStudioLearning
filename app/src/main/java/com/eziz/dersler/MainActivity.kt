package com.eziz.dersler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (ctv != null) {
            ctv.isChecked = false
            ctv.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)
            ctv.setOnClickListener {
                ctv.isChecked = !ctv.isChecked
                ctv.setCheckMarkDrawable(
                    if (ctv.isChecked) android.R.drawable.checkbox_on_background
                    else android.R.drawable.checkbox_off_background
                )
                val mesaj =
                    "CheckedTextView :" + getString(if (ctv.isChecked) R.string.secildi else R.string.secilmedi)
                Toast.makeText(this, mesaj, Toast.LENGTH_LONG).show()
            }
        }
    }
}