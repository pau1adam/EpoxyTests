package io.github.pau1adam.epoxytests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val recipesController by lazy { RecipesController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            val linearLayoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recipesController.adapter
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            addItemDecoration(DividerItemDecoration(this@MainActivity, linearLayoutManager.orientation))
        }
        recipesController.requestModelBuild()
    }
}
