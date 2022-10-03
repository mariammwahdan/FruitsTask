package com.example.fruit777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.main_recycler_view)
        val list_of_fruits = get_list_of_fruits()
        val fruitAdapter = fruit_adapter(list_of_fruits)
        recyclerView.adapter = fruitAdapter
        fruitAdapter.onItemClick = {
            val intent = Intent(this, fruit_details::class.java)
            intent.putExtra("Fruit", it)
            startActivity(intent)
        }
    }

    private fun get_list_of_fruits(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple", R.drawable.apple, 12.0))
        fruits.add(Fruit("Mango", R.drawable.mango2, 59.9))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon2, 30.0))
        fruits.add(Fruit("Peach", R.drawable.peach, 22.0))
        fruits.add(Fruit("Dragon Fruit", R.drawable.dragonfruit, 120.0))
        fruits.add(Fruit("Banana", R.drawable.banana, 20.0))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry2, 40.0))
        fruits.add(Fruit("Kiwi", R.drawable.kiwi1, 45.0))
        fruits.add(Fruit("Berry", R.drawable.berries, 10.0))
        fruits.add(Fruit("Cherry", R.drawable.cherries, 70.0))
        fruits.add(Fruit("Orange", R.drawable.orange, 90.0))
        fruits.add(Fruit("Papaya", R.drawable.papaya, 150.0))




        return fruits
    }
}