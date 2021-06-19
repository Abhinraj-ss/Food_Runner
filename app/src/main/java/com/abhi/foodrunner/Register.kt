package com.abhi.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etMobile:EditText
    lateinit var etDelivery:EditText
    lateinit var etPass:EditText
    lateinit var etConfirm:EditText
    lateinit var btnRegister:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        title="Register Yourself"
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etMobile=findViewById(R.id.etMobile)
        etDelivery=findViewById(R.id.etDelivery)
        etPass=findViewById(R.id.etPass)
        etConfirm=findViewById(R.id.etConfirmPass)
        btnRegister=findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            var name=etName.text.toString()
            val intent=Intent(this@Register,Welcome::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}
