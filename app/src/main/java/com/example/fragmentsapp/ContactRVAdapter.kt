package com.example.fragmentsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsapp.ContactCallback
import com.example.fragmentsapp.R
import kotlinx.android.synthetic.main.contact_item.view.*

class PersonRVAdapter(var personList : ArrayList<Contact>, val callback: PersonCallback)
    : RecyclerView.Adapter<PersonRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.contact_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.populatePersonItem(personList[position])

    override fun getItemCount() = personList.size

    fun updateList(passedList: ArrayList<Contact>) {
        personList = passedList
        notifyDataSetChanged()
    }
}