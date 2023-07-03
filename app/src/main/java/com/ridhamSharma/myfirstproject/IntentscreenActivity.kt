package com.ridhamSharma.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IntentscreenActivity : AppCompatActivity() {
    var name =""
    var college =""
    var number = ""
     var marks=0f
    var percentage = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intentscreen)
        intent?.let{
            name=it.getStringExtra("name") ?: ""
            college = it.getStringExtra("college") ?: ""
            number = it.getStringExtra("number") ?:""
            marks = it.getFloatExtra("marks",0f)
             percentage = it.getDoubleExtra("percentage", 0.0)
           // System.out.println("name $name college $college Phone number $number Total marks $marks percentage $percentage")

        }
       System.out.println("name $name college $college Phone number $number Total marks $marks percentage $percentage")


    }
}