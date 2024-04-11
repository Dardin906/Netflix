package com.example.googleplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgView1 = findViewById<ImageView>(R.id.ImageView1)
       // val imgView2 = findViewById<ImageView>(R.id.imageView2)
        val imgView3 = findViewById<ImageView>(R.id.imageView3)
        val imgView4= findViewById<ImageView>(R.id.imageView4)
        val imgView5= findViewById<ImageView>(R.id.imageView5)
        val imgView6 = findViewById<ImageView>(R.id.imageView6)
        val imgView7 = findViewById<ImageView>(R.id.imageView7)
        //val imgView8 = findViewById<ImageView>(R.id.imageView8)
        val imgView9 = findViewById<ImageView>(R.id.imageView9)
        val imgView10 = findViewById<ImageView>(R.id.imageView10)
        val imgView11 = findViewById<ImageView>(R.id.imageView11)
       // val imgView12 = findViewById<ImageView>(R.id.imageView12)
        val imgView13 = findViewById<ImageView>(R.id.imageView13)
        val imgView14 = findViewById<ImageView>(R.id.imageView14)
        val imgView15 = findViewById<ImageView>(R.id.imageView15)


        imgView1.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply{
                val titulo = "Shrek"
                val tipo = "Filme"
                val sinopse = "Shrek"
                val tituloori = "Shrek"
                val genero = "Shrek"
                val episodios = "Shrek"
                val anoprod = "Shrek"
                val pais = "Shrek"
                val direcao = "Shrek"
                val elenco = "Shrek"
                val dispate = "Shrek"

                putExtra("id_img", R.drawable.shrek)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("tituloori", tituloori)
                putExtra("genero", genero)
                putExtra("episodeos", episodios)
                putExtra("anoprod", anoprod)
                putExtra("pais", pais)
                putExtra("direcao", direcao)
                putExtra("elenco", elenco)
                putExtra("dispate", dispate)

            }
            Toast.makeText(this, "clicou imagem 1", LENGTH_SHORT).show()
            startActivity(intent)

        }
        imgView3.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply{
                val titulo = "Enrolados"
                val tipo = "Filme"
                val sinopse = ""
                val tituloori = ""
                val genero = ""
                val episodeos = ""
                val anoprod = ""
                val pais = ""
                val direcao = ""
                val elenco = ""
                val dispate = ""

                putExtra("id_img", R.drawable.enrolados)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("tituloori", tituloori)
                putExtra("genero", genero)
                putExtra("episodeos", episodeos)
                putExtra("anoprod", anoprod)
                putExtra("pais", pais)
                putExtra("direcao", direcao)
                putExtra("elenco", elenco)
                putExtra("dispate", dispate)
            }
            Toast.makeText(this, "clicou imagem 3", LENGTH_SHORT).show()

            Toast.makeText(this, "clicou imagem 3", LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView3.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply{

            }
            Toast.makeText(this, "clicou imagem 4", LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView4.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply{

            }
            Toast.makeText(this, "clicou imagem 5", LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView5.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply {

            }
            Toast.makeText(this, "clicou imagem 6", LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView6.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply {

            }
            Toast.makeText(this, "clicou imagem 7", LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView7.setOnClickListener {
            val intent: Intent = Intent( this,Detalhe::class.java).apply {

            }
        }

    }

}



