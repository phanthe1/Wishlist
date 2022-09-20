package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListAdapter(private val wishes: List<Wish>) : RecyclerView.Adapter<WishListAdapter.ViewHolder> () {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameTextView: TextView
        var priceTextView: TextView
        var urlTextView: TextView

        init {
            nameTextView = itemView.findViewById(R.id.itemText)
            priceTextView = itemView.findViewById(R.id.costText)
            urlTextView = itemView.findViewById(R.id.urlText)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val wishView = inflater.inflate(R.layout.wishlist_item, parent, false)

        return ViewHolder(wishView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wish = wishes.get(position)

        holder.nameTextView.text = wish.name
        holder.priceTextView.text = wish.price
        holder.urlTextView.text = wish.url
    }

    override fun getItemCount(): Int {
        return wishes.size
    }
}