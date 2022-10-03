package com.example.fruit777

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class fruit_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)
        val fruit = intent.getParcelableExtra<Fruit>("Fruit")
        if (fruit != null) {
            val fruit_image_2: ImageView = findViewById(R.id.fruit_image_2)
            val fruit_name_2: TextView = findViewById(R.id.fruit_name_label_2)
            val fruit_price_2: TextView = findViewById(R.id.fruit_price_2)

            fruit_image_2.setImageResource(fruit.fruit_image)
            fruit_name_2.text = fruit.fruit_name
            fruit_price_2.text = fruit.fruit_price.toString()

        }
    }
}