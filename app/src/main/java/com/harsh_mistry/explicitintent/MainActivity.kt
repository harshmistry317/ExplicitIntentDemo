package com.harsh_mistry.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nextbutton=findViewById<Button>(R.id.btn_next)
        nextbutton.setOnClickListener {
            var intent= Intent(applicationContext,MainActivity2::class.java)
            intent.putExtra("username","Harsh")
            startActivity(intent)
        }

    }
}