package com.example.msit_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_signin.*
import kotlinx.android.synthetic.main.fragment_signup.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signIn = Signin()
        val signUp = Signup()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.my_frame_layout,signIn)
            addToBackStack(null)
            commit()
        }

        loginTv.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.my_frame_layout,signIn)
                addToBackStack(null)
                commit()
            }
        }
        signupTv.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.my_frame_layout,signUp)
                addToBackStack(null)
                commit()
            }
        }

    }
}