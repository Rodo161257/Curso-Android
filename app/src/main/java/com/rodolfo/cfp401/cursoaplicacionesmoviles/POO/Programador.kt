package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO

class Programador  {
    var nombre = String
    var estudios = ""
    var lenguaje = listOf("")

    constructor(nombre: String, estudios: String, lenguajes: List<String>)

    fun programar(){
        println("Estoy desarrollando una app!")
    }
}