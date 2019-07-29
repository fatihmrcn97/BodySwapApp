package com.example.faceswap

import android.content.ContentProvider
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_cemetery.*


var name:Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun died1(view:View){


        name = 1
        val intent =Intent(applicationContext,Cemetery::class.java)

        startActivity(intent)

    }
    fun died2(view:View){
        name=2

        val intent =Intent(applicationContext,Cemetery::class.java)

        startActivity(intent)
    }
    fun died3(view:View){
        name=3
        val intent =Intent(applicationContext,Cemetery::class.java)

        startActivity(intent)

    }
    fun died4(view:View){
        name=4
        val intent =Intent(applicationContext,Cemetery::class.java)

        startActivity(intent)

    }
}
