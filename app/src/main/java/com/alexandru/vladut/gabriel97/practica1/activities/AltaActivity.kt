package com.alexandru.vladut.gabriel97.practica1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alexandru.vladut.gabriel97.practica1.MainActivity
import com.alexandru.vladut.gabriel97.practica1.R
import com.alexandru.vladut.gabriel97.practica1.models.Usuario

lateinit var textViewTipo: TextView
lateinit var textViewApellido:TextView
lateinit var textViewNombre: TextView
class AltaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alta)

        textViewTipo = findViewById(R.id.textViewTipo)
        textViewApellido = findViewById(R.id.textViewApellido)
        textViewNombre = findViewById(R.id.textViewNombre)

        var bundleUsuario = intent.getBundleExtra("claseUsuario")
        var usuario = Usuario(bundleUsuario!!)
        textViewTipo.text = usuario.tipoUsuario
        textViewNombre.text = usuario.nombre
        textViewApellido.text = usuario.apellido

        val botonVolver = findViewById<Button>(R.id.buttonVolver)

        botonVolver.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Cerrar la actividad actual (AltaActivity)
            finish()
        }


    }
}