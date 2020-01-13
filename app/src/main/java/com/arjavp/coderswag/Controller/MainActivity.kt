package com.arjavp.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.arjavp.coderswag.Model.Category
import com.arjavp.coderswag.R
import com.arjavp.coderswag.Services.DataService
import com.arjavp.coderswag.adapters.CategoryAdapter
import com.arjavp.coderswag.adapters.CategoryRecycleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,
            DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager= LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
