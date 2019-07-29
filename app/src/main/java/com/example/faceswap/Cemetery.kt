package com.example.faceswap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cemetery.*

class Cemetery : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cemetery)

        if(name==1){
            imageView.setImageResource(R.drawable.muslim)

        }else if(name==2){
            imageView.setImageResource(R.drawable.jew)
        }else if(name==3){
            imageView.setImageResource(R.drawable.ch1)
        }else{
            imageView.setImageResource(R.drawable.other)
            textView.text="LIKE EVERY END"
        }
    }
}
