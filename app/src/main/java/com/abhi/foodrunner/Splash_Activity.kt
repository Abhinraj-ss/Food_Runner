package com.abhi.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView

class StartUpPage : AppCompatActivity() {
    lateinit var imgLogo:ImageView
    lateinit var txtName:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        Handler().postDelayed({
            val startAct=Intent(this@StartUpPage,LogInActivity::class.java)
            startActivity(startAct)
        },2000)
        imgLogo=findViewById(R.id.imgLogo)
        txtName=findViewById(R.id.txtName)
    }

    override fun onPause() {
        super.onPause()
    finish()
    }


}
