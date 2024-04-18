package com.example.insgram

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class firstFragment : Fragment() {
    lateinit var shared: SharedPreferences
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shared=view.context.getSharedPreferences("myshard",0)
        if (shared.getString("first","")==""&&shared.getString("second","")==""&&shared.getString("age","")==""&&shared.getString("num","")==""){

            Handler().postDelayed({
                parentFragmentManager.beginTransaction().replace(R.id.fl1,secondFragment()).commit()
            },2000)

        }
        else{
            Handler().postDelayed({
                parentFragmentManager.beginTransaction().replace(R.id.fl1,thirdFragment()).commit()
            },2000)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}