package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.Random
class MainActivity : AppCompatActivity() {
    var numeroAleatorio:Int =0
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun empezar(v: View)
     {
         val aleatorio =  Random()
         numeroAleatorio = aleatorio.nextInt(1000)+1
     }
    fun interntar(v: View)
    {
        contador++
        var digitar = findViewById<EditText>(R.id.digitar)
        var numIntento = digitar.text.toString().toInt()
        if (numIntento<numeroAleatorio)
        {
            Toast.makeText(this, "un numero mas alto", Toast.LENGTH_LONG).show()
        }
        if (numIntento>numeroAleatorio)
        {
            Toast.makeText(this, "un numero mas bajo", Toast.LENGTH_LONG).show()
        }
        if (numIntento==numeroAleatorio)
        {
            Toast.makeText(this, "HAS GANADO, NUMERO DE INTENTOS:$contador", Toast.LENGTH_LONG).show()

        }

    }


}