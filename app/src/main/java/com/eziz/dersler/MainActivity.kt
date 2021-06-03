package com.eziz.dersler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var seherListi = resources.getStringArray(R.array.seherler)
        var adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, seherListi)
        actv.setAdapter(adapter)
        actv.threshold = 1
    }
}