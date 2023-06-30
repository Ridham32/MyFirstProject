package com.ridhamSharma.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var cbIAgree: CheckBox?= null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio)
        cbIAgree = findViewById(R.id.cbIAgree)

        cbIAgree?.setOnCheckedChangeListener{ buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this,"Checked",Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this,"Not Checked",Toast.LENGTH_LONG).show()
            }
        }
    }
}