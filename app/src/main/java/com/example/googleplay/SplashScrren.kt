package com.example.googleplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScrren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scrren)

        Handler().postDelayed(
            Runnable
            {
                val i: Intent = Intent(this, MainActivity::class.java)
                startActivity(i)

                //close the activity
                finish()

            }, 5 * 1000
        ) //wait for5 seconds
    }
}