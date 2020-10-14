package com.example.login_signup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import com.example.login_signup.auth.ui.activity.AuthActivity
import com.example.login_signup.base.data.local.UserPreference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userPreference = UserPreference(this)
        userPreference.authToken.asLiveData().observe(this, Observer { authToken ->


        })

        finish()
        startActivity(Intent(this, AuthActivity::class.java))
    }
}