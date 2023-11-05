package com.alexandru.vladut.gabriel97.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import com.alexandru.vladut.gabriel97.practica1.activities.AltaActivity
import com.alexandru.vladut.gabriel97.practica1.models.Usuario

lateinit var editTextNombre:EditText
lateinit var editTextApellido:EditText
lateinit var radioGroup: RadioGroup
var apellido = ""
var nombre = ""
var tipoUsuario = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextApellido = findViewById(R.id.editTextApellido)
        editTextNombre = findViewById(R.id.editTextNombre)
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
    }
    fun onAltaUsuario(view: View) {
        nombre = editTextNombre.text.toString()
        apellido = editTextApellido.text.toString()
        val radioButtonId = radioGroup.checkedRadioButtonId

        // Verificar cuál RadioButton está seleccionado
        when (radioButtonId) {
            R.id.radioAlumno -> {
                tipoUsuario = "Alumno"
            }
            R.id.radioProfesor -> {
                tipoUsuario = "Profesor"
            }
        }

        var usuario = Usuario(nombre,apellido,tipoUsuario)

        var mi_intent: Intent = Intent(this, AltaActivity::class.java)

        mi_intent.putExtra("claseUsuario", usuario.getBundle())
        startActivity(mi_intent)



    }
}