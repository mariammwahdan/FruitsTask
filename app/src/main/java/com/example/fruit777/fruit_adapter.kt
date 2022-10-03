package com.example.fruit777

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class fruit_adapter(private val fruit_list:List<Fruit>): RecyclerView.Adapter<fruit_adapter.fruit_item_holder>() {

    var onItemClick: ((Fruit)->Unit)?=null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fruit_item_holder
    {
        val item_fruit_view=
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return fruit_item_holder(item_fruit_view)
    }

    override fun onBindViewHolder(holder: fruit_item_holder, position: Int) {
        val current_fruit=fruit_list[position]
        holder.bind(current_fruit)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(current_fruit)

        }
    }

    override fun getItemCount(): Int
    {
        return fruit_list.size
    }

    inner class fruit_item_holder(itemView: View):RecyclerView.ViewHolder(itemView)
    {

        private val fruit_name: TextView
        private val fruit_image: ImageView
        init
        {
            fruit_name=itemView.findViewById(R.id.fruit_name_label)
            fruit_image=itemView.findViewById(R.id.fruit_image)

            itemView.setOnClickListener {
                val current_fruit =fruit_list[layoutPosition]
                val intent= Intent(itemView.context,fruit_details::class.java)
                intent.putExtra("Fruit",current_fruit)
                itemView.context.startActivity(intent)
            }
        }
        fun bind(fruit: Fruit)
        {
            fruit_name.text = fruit.fruit_name
            fruit_image.setImageResource(fruit.fruit_image)
        }

    }
}

