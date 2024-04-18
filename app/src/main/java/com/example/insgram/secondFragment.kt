package com.example.insgram

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class secondFragment : Fragment() {
lateinit var  first: TextInputEditText
lateinit var  second: TextInputEditText
lateinit var  num: TextInputEditText
lateinit var  age: TextInputEditText
lateinit var login:Button
lateinit var myshared: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        first=view.findViewById(R.id.first)
        second=view.findViewById(R.id.second)
        num=view.findViewById(R.id.num)
        age=view.findViewById(R.id.Age)
        login=view.findViewById(R.id.login)

        myshared=view.context.getSharedPreferences("myshard",0)
         login.setOnClickListener(){
             if(first.text.toString()=="" &&second.text.toString()==""&&age.text.toString()==""&&num.text.toString()=="")
                 Toast.makeText(this.context,"complate Data",Toast.LENGTH_SHORT).show()
                 else{
             myshared.edit().putString("first",first.text.toString()).apply()
             myshared.edit().putString("second",second.text.toString()).apply()
             myshared.edit().putString("age",age.text.toString()).apply()
             myshared.edit().putString("num",num.text.toString()).apply()
        parentFragmentManager.beginTransaction().replace(R.id.fl1,thirdFragment()).commit()
                    }

         }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


}