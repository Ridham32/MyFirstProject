package com.ridhamSharma.myfirstproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.service.autofill.TextValueSanitizer
import android.widget.TextView
import org.w3c.dom.Text

class IntentscreenActivity : AppCompatActivity() {
    var name =""
    var college =""
    var number = ""
     var marks=0f
    var percentage = 0.0
    var tvName : TextView?= null
    var tvCollegeinfo: TextView?= null
    var tvPhonenumber: TextView?= null
    var tvTotalmarks: TextView?= null
    var tvPercentage: TextView?= null
    @SuppressLint("MissingInflatedId")
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
        tvName = findViewById(R.id.tvName)
        tvName?.setText(name)
        tvCollegeinfo = findViewById(R.id.tvCollegeinfo)
        tvCollegeinfo?.setText(college)
        tvPhonenumber = findViewById(R.id.tvPhonenumber)
        tvPhonenumber?.setText(number)
        tvTotalmarks= findViewById(R.id.tvTotalmarks)
        tvTotalmarks?.setText(marks.toString())
        tvPercentage = findViewById(R.id.tvPercentage)
        tvPercentage?.setText(percentage.toString())


       System.out.println("name $name college $college Phone number $number Total marks $marks percentage $percentage")


    }
}