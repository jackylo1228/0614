package com.example.myapplication5

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class Globa : Application(){
    companion object{
        private  var admin : String = "B08170140"

        fun setName(name: String){
            this.admin= admin
        }
        fun getName(): String{
            return admin
        }
    }

}

class MainActivity : AppCompatActivity() {

    lateinit var handler:Date
    var admin = Globa.getName()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            if (findViewById<EditText>(R.id.username).text.trim().isEmpty()||
                findViewById<EditText>(R.id.password).text.trim().isEmpty()){
                Toast.makeText(this,"Empty data provided",Toast.LENGTH_LONG).show()
            }else if(findViewById<EditText>(R.id.username).text.toString() == admin){
                if(findViewById<EditText>(R.id.password).text.toString()=="123")
                {
                    Toast.makeText(this,"Success Login",Toast.LENGTH_LONG).show()
                    var intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"Invalid Username/Password",Toast.LENGTH_LONG).show()

                }
            }else{
                Toast.makeText(this,"Invalid Username/Password",Toast.LENGTH_LONG).show()
            }
        }
    }
}