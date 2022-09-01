package com.balbasio.digits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_digits.*
import kotlinx.android.synthetic.main.activity_main.*

class DigitsActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digits)
    val intent= Intent()
        var randomDigitsNumber=intent.getStringExtra("number")
        var userNumber=editTextNumber.text

        if (userNumber.toString()==randomDigitsNumber){
            Toast.makeText(applicationContext,"True",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(applicationContext,"False",Toast.LENGTH_LONG).show()
        }


    }
}