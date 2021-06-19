package com.abhi.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Welcome : AppCompatActivity() {
    var titleName="Welcome User"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        title=""
        if(intent!=null){
            titleName="Welcome ${intent.getStringExtra("name")}"
        }
        title= titleName
    }
}
