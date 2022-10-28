package com.example.uts_dwiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buah = arrayOf ("Mangga", "Rambutan", "Manggis", "Melon", "Semangka")

        val adapter = ArrayAdapter (this,android.R.layout.simple_expandable_list_item_1, buah)

        lv_buah.adapter = adapter
        lv_buah.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "Ini adalah Buah ${buah[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}