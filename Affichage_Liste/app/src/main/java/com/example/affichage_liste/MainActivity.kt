 package com.example.affichage_liste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.example.affichage_liste.model.Data
import com.example.affichage_liste.model.Reqres
import kotlinx.android.synthetic.main.activity_main.*


 class MainActivity : AppCompatActivity() {
     private val dataList: MutableList<Data> = mutableListOf()
     private lateinit var myAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //recyclerView
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        my_recycler_view.adapter = myAdapter


        //Adapter
        myAdapter = MyAdapter(dataList)



        //Android Networking

        AndroidNetworking.initialize(this)

        AndroidNetworking.get("https://api.quarantine.country/api/v1/summary/latest")
            .build()
            .getAsObjectList(Reqres::class.java, object : ParsedRequestListener<Reqres>{
                override fun onResponse(response: Reqres) {
                    dataList.addAll(listOf(response.data))
                    myAdapter.notifyDataSetChanged()
                }

                override fun onError(anError: ANError?) {
                }

            })
    }
}