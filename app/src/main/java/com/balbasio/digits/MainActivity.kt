package com.balbasio.digits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var randomNumber=(10000000..99999999).shuffled().last()
        object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
            timeText.text="Time:$millisUntilFinished/1000"
                numberText.text="$randomNumber"
            }
            override fun onFinish() {
                val intent=Intent(applicationContext,DigitsActivity::class.java)
                intent.putExtra("number",randomNumber)
                startActivity(intent)
                finish()
            }
        }
    }
}