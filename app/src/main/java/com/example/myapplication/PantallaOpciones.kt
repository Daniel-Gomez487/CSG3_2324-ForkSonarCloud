package com.example.myapplication

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PantallaOpciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_opciones)

        val btnBack : Button = findViewById(R.id.back)

        btnBack.setOnClickListener {
            val intent1 = Intent(this,MainMenu::class.java)
            startActivity(intent1)
        }

        val titulo: TextView = findViewById(R.id.titulo)
        titulo.paintFlags = titulo.paintFlags or Paint.UNDERLINE_TEXT_FLAG
    }
}