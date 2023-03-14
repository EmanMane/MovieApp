package com.example.rmalab2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.LayoutRes

class MyArrayAdapter(context: Context, @LayoutRes private val layoutResource: Int, private val elements: ArrayList<String>):
    ArrayAdapter<String>(context, layoutResource, elements) {
    override fun getView(position: Int, newView: View?, parent: ViewGroup): View {
        var newView = newView
        newView = LayoutInflater.from(context).inflate(R.layout.element_list, parent, false)
        val textView = newView.findViewById<TextView>(R.id.textElement)
        val element = elements.get(position)
        textView.text=element
        return newView
    }
}

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var editText: EditText
    private lateinit var button: Button
    // moze se koristiti i mutableListOf
    private val  listaVrijednosti = arrayListOf<String>()
    private lateinit var adapter : MyArrayAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inicijalizirat cemo elemente
        button = findViewById(R.id.button1);
        editText = findViewById(R.id.editText1)
        listView = findViewById(R.id.listView1)
        //Koristi se androidov layout
        adapter = MyArrayAdapter(this, R.layout.element_list, listaVrijednosti)
        listView.adapter=adapter
        //Definisat cemo akciju u slucaju klik akcije
        button.setOnClickListener {
            addToList()
        }
    }
    //Poziva se na klik dugmenta
    private fun addToList() {
        // Novi tekst se dodaje kao prvi element
        listaVrijednosti.add(0,editText.text.toString())
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
}