package com.alexandru.vladut.gabriel97.practica1.models

import android.os.Bundle

class Usuario {

    var nombre:String
    var apellido:String
    var tipoUsuario:String

    constructor(nombre: String, apellido: String, tipoUsuario: String) {
        this.nombre = nombre
        this.apellido = apellido
        this.tipoUsuario = tipoUsuario
    }
    constructor(bundle: Bundle){
        this.nombre = bundle.getString("nombre")!!
        this.apellido = bundle.getString("apellido")!!
        this.tipoUsuario = bundle.getString("tipoUsuario")!!
    }
    fun getBundle(): Bundle?{
        var bundle = Bundle()

        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido", this.apellido)
        bundle.putString("tipoUsuario", this.tipoUsuario)
        return bundle
    }
}