package com.geeks.emil_maldybaev_hw3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ContactAdapter(private val contactNameList: ArrayList<String>) :
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        return ContactsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_contacts, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) { //передача данных
        holder.onBind(contactNameList[position])
    }

    override fun getItemCount(): Int {
        return contactNameList.size
    }
}

