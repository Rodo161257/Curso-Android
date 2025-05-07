package com.rodolfo.cfp401.cursoaplicacionesmoviles

import kotlin.math.sin

fun esMayorDeEdad(): String{
    var edad: Int = readln().toInt()
    if (edad >= 18) return "Es mayor de edad"
    else return "Es menor de edad"
}

fun main(){
    var persona1: String = "Cacho"
    var persona2: String = "Tito"
    var suma: String = (persona1 + persona2)
    println(suma)
    compararPersonas(persona1, persona1)
    compararPersonas("Tito", "cacho")
    compararPersonas(persona2, persona1)
}

fun compararPersonas(persona1: String, persona2: String) {
    // return "Pepe"              Lo que está debajo de un return nunca se va a ejecutar
    if (persona1 == persona2) println ("Las personas son iguales")
    else println("Personas1 y Persona2 no son iguales")
}

// Para sacar un regristro de conducir se necesita: se mayor de edad o en caso contrario, tener el
// de los padres / tutores. Cree una función de devuelva "Usted puede sacar registro" "Vuelva cuando
// sea mayor de edad




