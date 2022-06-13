package com.example.myapplication5

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity2 : AppCompatActivity() {


    var admin = Globa.getName()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        findViewById<TextView>(R.id.textView2).text = "admin:"+admin

        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Logout",Toast.LENGTH_LONG).show()

        }
    }





}