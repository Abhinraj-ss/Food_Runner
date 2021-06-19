package com.abhi.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Details : AppCompatActivity() {
    lateinit var txtName:TextView
    lateinit var txtMobile:TextView
    lateinit var txtEmail:TextView
    lateinit var txtAddress:TextView
    var titleName="welcome user"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        if(intent!=null){
            titleName="Welcome ${intent.getStringExtra("name")}"
        }
        title= titleName
        txtName=findViewById(R.id.txtName)
        txtMobile=findViewById(R.id.txtMobile)
        txtEmail=findViewById(R.id.txtEmail)
        txtAddress=findViewById(R.id.txtAddress)
    }
}
