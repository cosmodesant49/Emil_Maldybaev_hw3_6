package com.geeks.emil_maldybaev_hw3_6

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvName // inicialization
            : TextView

    init {
        tvName = itemView.findViewById(R.id.tv_name)
    }

    fun onBind(contactName: String?) { // get information by adapter
        tvName.text = contactName
    }
}
