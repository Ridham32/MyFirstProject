package com.ridhamSharma.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etName: EditText?= null
    var etCollegeInfo: EditText?= null
    var etPhoneNumber: EditText? = null
     var btnValidate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etCollegeInfo = findViewById(R.id.etCollegeInfo)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        btnValidate = findViewById(R.id.btnValidate)

        btnValidate?.setOnClickListener {
            if (etName?.text.isNullOrEmpty()){
                etName?.error = "Enter your name"
        } else if(etCollegeInfo?.text.isNullOrEmpty()) {
                etCollegeInfo?.error = "Enter Something About Your College"
            } else if(etPhoneNumber?.text.isNullOrEmpty()) {
                etPhoneNumber?.error =  "Enter Your Phone Number"
            } else if(etPhoneNumber?.text.toString().length<10) {
                etPhoneNumber?.error = "Enter a Validate phone number"
            }else {
                Toast.makeText(this,"Form validated successfully",Toast.LENGTH_LONG).show()

            }






        //? use to check null property ...put
        // toast has fixed position and in built function
        }




    }
}