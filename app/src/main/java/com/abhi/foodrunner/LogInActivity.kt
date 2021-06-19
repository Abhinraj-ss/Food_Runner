package com.abhi.foodrunner

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.abhi.foodrunner.R.id.imgLogo
import com.abhi.foodrunner.R.id.txtForgot

class LogInActivity : AppCompatActivity() {
    lateinit var imgLogo: ImageView
    lateinit var etMobile:EditText
    lateinit var etPass:EditText
    lateinit var btnLogin: Button
    lateinit var txtForgot: TextView
    lateinit var txtSignup: TextView
    lateinit var sharedPreferences: SharedPreferences
    var validMobile:String="0123456789"
    val validPass:String="foodrunner"
    var name="Rahul"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title= "User Login-FoodRunner"
        sharedPreferences=getSharedPreferences(getString(R.string.preferences), Context.MODE_PRIVATE)
        val isLoggedIn=sharedPreferences.getBoolean("isLoggedIn",false)
        if(isLoggedIn){//p
            val intent=Intent(this@LogInActivity,Details::class.java)
            startActivity(intent)
        }
        else {
            setContentView(R.layout.activity_log__in_)
            imgLogo=findViewById(R.id.imgLogo)
            etMobile=findViewById(R.id.etMobile)
            etPass=findViewById(R.id.etPass)
            btnLogin=findViewById(R.id.btnLogIn)
            txtForgot=findViewById(R.id.txtForgot)
            txtSignup=findViewById(R.id.txtSignup)
            btnLogin.setOnClickListener {
                val mobileNo = etMobile.text.toString()
                val pass = etPass.text.toString()
                if (mobileNo == validMobile && pass == validPass) {
                    val intent = Intent(this@LogInActivity, Details::class.java)
                    intent.putExtra("name",name)
                    startActivity(intent)
                    setPreferences()
                } else {
                    Toast.makeText(this@LogInActivity, "incorrect credentials", Toast.LENGTH_LONG).show()
                }
            }
            txtForgot.setOnClickListener {
                val intent = Intent(this@LogInActivity, ForgotPass::class.java)
                startActivity(intent)
            }
            txtSignup.setOnClickListener {
                val intent = Intent(this@LogInActivity, Register::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onPause() {//p
        super.onPause()
        finish()
    }
    fun setPreferences(){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }

}
