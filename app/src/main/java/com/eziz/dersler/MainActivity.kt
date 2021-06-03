package com.eziz.dersler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var langList = resources.getStringArray(R.array.langs)
        var adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, langList)
        mactv.setAdapter(adapter)
        mactv.threshold = 1
        mactv.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
        button.setOnClickListener {
            val text = "Secilenler :" + mactv.text
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        }
    }
}