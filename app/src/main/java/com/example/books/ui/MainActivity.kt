package com.example.books.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.books.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startFragment()
    }

    private fun startFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment, BooksFragment())
            .commit()
    }

}