package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter


class Pantalla2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        leerArchivo()

        val btn: Button = findViewById(R.id.butnGoBack)
        btn.setOnClickListener{
            val intent1 = Intent(this,MainMenu::class.java)
            startActivity(intent1)
        }
    }

    fun llenarData(texto: String){
        val textZone :TextView = findViewById(R.id.textPartidas)
        textZone.text = texto
    }

    fun leerArchivo() {
        try {
            var txt = ""
            val fin = BufferedReader(InputStreamReader(openFileInput("data.txt")))
            fin.useLines { lines ->
                lines.forEach {
                    txt += it + "\n"
                }
            }
            llenarData(txt)
        } catch (ex: java.lang.Exception) {
            Log.e("Ficheros", "Error al leer el fichero desde la memoria interna")
        }
    }
}