package com.geeks.emil_maldybaev_hw3_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val contactNameList = ArrayList<String>()
    private var rvContact: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        LoadData()
    }

    private fun LoadData() {
        contactNameList.add("human1")
        contactNameList.add("human2")
        contactNameList.add("human3")
        contactNameList.add("human4")
        contactNameList.add("human5")
        contactNameList.add("human6")
        contactNameList.add("human7")
        contactNameList.add("human8")
        contactNameList.add("human9")
        contactNameList.add("human10")
        contactNameList.add("human12")
        contactNameList.add("human13")
        contactNameList.add("human14")
        contactNameList.add("human15")
        contactNameList.add("human16")
        contactNameList.add("human17")
        contactNameList.add("human18")
        contactNameList.add("human19")
        contactNameList.add("human20")


        initAdapter()
    }

    private fun initAdapter() {
        val adapter = ContactAdapter(contactNameList)
        rvContact!!.adapter = adapter
    }

    private fun initView() {
        rvContact = findViewById(R.id.rv_contacts)
    }
}