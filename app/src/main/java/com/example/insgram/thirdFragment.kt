package com.example.insgram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class thirdFragment : Fragment() {
    lateinit var myrec:RecyclerView
    lateinit var item:ArrayList<mydata>
    lateinit var myrec1:RecyclerView
    lateinit var item2:ArrayList<mydata2>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//..................................................................................................
        myrec1=view.findViewById(R.id.rec1)
        myrec1.layoutManager= LinearLayoutManager(this.context,RecyclerView.HORIZONTAL,false)
        item2= ArrayList()

        item2.add(mydata2(R.drawable.person1,"Tadrous samir"))
        item2.add(mydata2(R.drawable.iiii,"mena mahr"))
        item2.add(mydata2(R.drawable.person3,"mhamad omar"))
        item2.add(mydata2(R.drawable.prson2,"MOsalah"))
        item2.add(mydata2(R.drawable.person6,"MOna"))
        item2.add(mydata2(R.drawable.person1,"Tadrous samir"))
        item2.add(mydata2(R.drawable.iiii,"mena mahr"))
        item2.add(mydata2(R.drawable.person3,"mhamad omar"))
        item2.add(mydata2(R.drawable.prson2,"MOsalah"))
        item2.add(mydata2(R.drawable.person6,"MOna"))
        myrec1.adapter=secondadapter(this.item2)
//..................................................................................................
        myrec=view.findViewById(R.id.rec2)

        myrec.layoutManager= LinearLayoutManager(this.context,RecyclerView.VERTICAL,false)
        item= ArrayList()
        item.add(mydata(R.drawable.person1,"Tadrous samir",R.drawable.post2))
        item.add(mydata(R.drawable.iiii,"mena mahr",R.drawable.post5))
        item.add(mydata(R.drawable.person3,"mhamad omar",R.drawable.post4))
        item.add(mydata(R.drawable.prson2,"MOsalah",R.drawable.post3))
        item.add(mydata(R.drawable.person6,"MOsalah",R.drawable.post6))
        item.add(mydata(R.drawable.prson2,"mira mohsen",R.drawable.post7))
//
        myrec.adapter=newadapter(this.item)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }


}