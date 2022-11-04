package com.example.stos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Sadd = findViewById<Button>(R.id.button)
        val Sdelete = findViewById<Button>(R.id.button2)
        val n1 = findViewById<TextView>(R.id.n1)
        var liczby = LinkedList<Int>();
        val Wprowadzanie = findViewById<EditText>(R.id.wpiszs)
        Sadd.setOnClickListener {
            if (liczby.isEmpty()) {
                Sdelete.isEnabled = true
                liczby.addFirst(Wprowadzanie.text.toString().toInt())
                n1.text = liczby.first.toString()
            } else {
                liczby.add(Wprowadzanie.text.toString().toInt())
                n1.text = liczby.last.toString()
            }
        }
        Sdelete.setOnClickListener {
            liczby.removeLast()
            if (liczby.isEmpty()) {
                n1.text = ""
                Sdelete.isEnabled = false
            } else {
                n1.text = liczby.last.toString()
            }
        }
    }
}