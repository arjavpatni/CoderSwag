package com.arjavp.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.arjavp.coderswag.Model.Category
import com.arjavp.coderswag.R
import com.arjavp.coderswag.Services.DataService
import com.arjavp.coderswag.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
            DataService.categories)
        categoryListView.adapter=adapter
    }
}
