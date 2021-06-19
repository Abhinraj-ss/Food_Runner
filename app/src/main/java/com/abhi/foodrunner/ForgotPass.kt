package com.abhi.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ForgotPass : AppCompatActivity() {
    lateinit var imgLogo:ImageView
    lateinit var txtText:TextView
    lateinit var etMobile:EditText
    lateinit var etEmail:EditText
    lateinit var btnNext:Button
    var validMobileNo="0123456789"
    var validEmail="rahul123@gmail.com"
    var name="Rahul"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)
        title="Forgot Password"
        imgLogo=findViewById(R.id.imgLogo)
        txtText=findViewById(R.id.txtText)
        etMobile=findViewById(R.id.etMobile)
        etEmail=findViewById(R.id.etEmail)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var mobile=etMobile.text.toString()
            var email=etEmail.text.toString()
            if (mobile==validMobileNo&&email==validEmail) {
                val intent = Intent(this@ForgotPass, Details::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
            }
            else{
                Toast.makeText(this@ForgotPass,"incorrect credentials",Toast.LENGTH_LONG).show()
            }
        }
    }

}
