package com.example.recyclerview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Arrays


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null

    // Using ArrayList to store images data
    var courseImg: ArrayList<*> = ArrayList<Any>(
        Arrays.asList<Any>(
            R.drawable.ig, R.drawable.index,
            R.drawable.pin, R.drawable.rrrrrt,
            R.drawable.twit, R.drawable.mpesa,
            R.drawable.images, R.drawable.cam
        )
    )
    var courseName: ArrayList<*> = ArrayList(
        Arrays.asList(
            "Data Structure", "C++", "C#", "JavaScript", "Java",
            "C-Language", "HTML 5", "CSS"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting reference of recyclerView
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView

        // Setting the layout as linear
        // layout for vertical orientation
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = linearLayoutManager

        // Sending reference and data to Adapter
        val adapter = Adapter(this@MainActivity, courseImg, courseName)

        // Setting Adapter to RecyclerView
        recyclerView!!.adapter = adapter
    }
}
