package com.ayaanle.currencyconverter

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    var convert:Button? = null
    var swap:Button? = null
    lateinit var utils: Utils
    private lateinit var builder:AlertDialog.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (convert != null)
        {
            convert?.setOnClickListener {
                Toast.makeText(applicationContext , "Correct..." , Toast.LENGTH_SHORT).show()
                utils.dialog_initializer().show()

            }
        }
    }
}