package com.example.affichage_liste

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.affichage_liste.model.Data
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view.view.*

class MyAdapter(private val dataList: MutableList<Data>) : RecyclerView.Adapter<Myholder>() {


    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myholder {
       context = parent.context
        return Myholder(LayoutInflater.from(context).inflate(R.layout.item_view, parent))
    }

    override fun onBindViewHolder(holder: Myholder, position: Int) {
        val data = dataList[position]

        val userFullNameTextView = holder.itemView.user_full_name
        val userAvatarImgView = holder.itemView.user_avatar
        val fullName = "${data.regions}"
        userFullNameTextView.text = fullName

        Picasso.get()
                .load(fullName)
                .into(userAvatarImgView)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, fullName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = dataList.size
}

