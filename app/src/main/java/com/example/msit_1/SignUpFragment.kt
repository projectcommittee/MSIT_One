package com.example.msit_1

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_signup.*
import kotlinx.android.synthetic.main.fragment_signup.view.*


class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        view.loginTv.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.container_layout, SignInFragment())
                disallowAddToBackStack()
                commit()
            }
        }
        view.iv_back.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.container_layout, SignInFragment())
                disallowAddToBackStack()
                commit()
            }
        }
        return view
    }

}