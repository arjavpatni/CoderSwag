package com.arjavp.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import com.arjavp.coderswag.R
import com.arjavp.coderswag.Services.DataService
import com.arjavp.coderswag.Utilities.EXTRA_CATEGORY
import com.arjavp.coderswag.adapters.ProductsAdapter
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize> 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.adapter = adapter
        productListView.layoutManager = layoutManager
    }
}
