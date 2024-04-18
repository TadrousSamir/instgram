package com.example.insgram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class fourFragment : Fragment() {
    lateinit var img6:ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        img6=view.findViewById(R.id.img6)

        var recive=arguments?.getInt("img")
        img6.setImageResource(recive.toString().toInt())

        // parentFragmentManager.beginTransaction().replace(R.id.fl1,thirdFragment()).commit()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }


}