package com.ridhamSharma.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etName: EditText?= null
    var etCollegeInfo: EditText?= null
    var etPhoneNumber: EditText? = null
    var etMarks: EditText?= null
    var etPercentage: EditText?= null
     var btnValidate: Button? = null
    //var btnMove: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etCollegeInfo = findViewById(R.id.etCollegeInfo)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        etMarks = findViewById(R.id.etMarks)
        etPercentage = findViewById(R.id.etPercentage)
        btnValidate = findViewById(R.id.btnValidate)

       // btnMove = findViewById(R.id.btnMove)

        btnValidate?.setOnClickListener {
            if (etName?.text.isNullOrEmpty()){
                etName?.error = "Enter your name"
        } else if(etCollegeInfo?.text.isNullOrEmpty()) {
                etCollegeInfo?.error = "Enter Something About Your College"
            } else if(etPhoneNumber?.text.isNullOrEmpty()) {
                etPhoneNumber?.error =  "Enter Your Phone Number"
            } else if(etPhoneNumber?.text.toString().length<10) {
                etPhoneNumber?.error = "Enter a Validate phone number"
            } else if(etMarks?.text.isNullOrEmpty()){
                etMarks?.error="Enter Your Marks"
            } else if(etPercentage?.text.isNullOrEmpty()){
                etPercentage?.error = "Enter Your Percentage"
            } else {
                Toast.makeText(this,"Form validated successfully",Toast.LENGTH_LONG).show()
                var intent = Intent(this,IntentscreenActivity::class.java)  //ticket to go to next screen
                intent.putExtra("name",etName?.text.toString())
                intent.putExtra("college", etCollegeInfo?.text.toString())
                intent.putExtra("number",etPhoneNumber?.text.toString())
                intent.putExtra("marks",etMarks?.text.toString().toFloat())
                intent.putExtra("percentage",etPercentage?.text.toString().toDouble())
                startActivity(intent)  // take to next screen
              //  finish()
            }
        //? use to check null property ...put
        // toast has fixed position and in built function
        }
//        btnMove?.setOnClickListener{
//            var intent = Intent(this,CheckboxRadioActivity::class.java)  //ticket to go to next screen
//            startActivity(intent)  // take to next screen
//            //finish() // take out of app after seeing 2nd page ...when you exit
//        }




    }
}