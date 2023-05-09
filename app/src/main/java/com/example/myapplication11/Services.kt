package com.example.myapplication11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Services : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        //we are using arrayAdapter to define an array
        val arrayAdapter: ArrayAdapter<*>
        val services = arrayOf("Book Publishing","Book Reviewing","Direct Marketing",
            "Social Media Marketing","App Development")

        //now accessing the listview which was created in xml
        val listview=findViewById<ListView>(R.id.listview)
        arrayAdapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,services)
        listview.adapter=arrayAdapter
    }
}