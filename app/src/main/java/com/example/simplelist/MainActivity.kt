package com.example.simplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview=findViewById<ListView>(R.id.List_view)
        val countrynames= arrayOf("Kenya","Tanzania","Rwanda","Uganda","Ethiopia","Burundi")

        val arrayAdapter:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,countrynames)
        listview.adapter=arrayAdapter

        listview.setOnItemClickListener { adapterView, view, position, id ->

            Toast.makeText(this,"You have clicked on" +countrynames[position],Toast.LENGTH_LONG).show()
        }





    }
}