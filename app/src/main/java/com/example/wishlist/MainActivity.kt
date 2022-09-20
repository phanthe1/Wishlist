package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var wishes: ArrayList<Wish> //Variable to store the list of wishes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // Button
//        val buttonSubmit = findViewById<Button>(R.id.submitButton)
//
//        // Retrieve value of users
//        val userNameInput = findViewById<EditText>(R.id.itemNameEdit)
//        val userPriceInput = findViewById<EditText>(R.id.costEdit)
//        val userUrlInput = findViewById<EditText>(R.id.urlEdit)
//
//
        wishes = ArrayList()
//
//        buttonSubmit.setOnClickListener {
//
//            var saveName = userNameInput.text.toString()
//            var savePrice = userPriceInput.text.toString()
//            var saveUrl = userUrlInput.text.toString()
//
//            wishes.add(Wish( saveName, savePrice, saveUrl))
//        }

        val wishesRv = findViewById<RecyclerView>(R.id.wishesRv)
        val adapter = WishListAdapter(wishes)

        wishesRv.adapter = adapter

        wishesRv.layoutManager = LinearLayoutManager(this)
    }
}