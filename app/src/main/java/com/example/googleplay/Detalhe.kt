package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class Detalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shrek)
        setSupportActionBar(findViewById(R.id.toolbar))
        val id_img = intent.getIntExtra("id_img", 0)
        val titulo = intent.getStringExtra("titulo")
        Toast.makeText(this, "$id_img", LENGTH_SHORT).show()
        val imgView = findViewById<ImageView>(R.id.imgDet)
        imgView.setImageResource(id_img)
        val det_titulo = findViewById<TextView>(R.id.tvTitulo)
        det_titulo.setText(titulo)
    }
}