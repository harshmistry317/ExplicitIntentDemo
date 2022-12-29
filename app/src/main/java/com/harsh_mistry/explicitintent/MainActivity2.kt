package com.harsh_mistry.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent=getIntent()
        var unm=intent.getStringExtra("username")
        Toast.makeText(applicationContext,"Hello $unm", Toast.LENGTH_LONG).show()
    }
}