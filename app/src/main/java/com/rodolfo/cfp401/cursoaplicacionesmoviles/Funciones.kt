package com.rodolfo.cfp401.cursoaplicacionesmoviles

/*
Una función es una caja negra que realiza una acción y nos devuelve o no, un resultado.
Se utiliza para modularizar y hacer código reutilizable.

Nonos interesa cómo está hecha sólo lo que hace y qué tiene que recibir.
Esas cajas negras son también pequeños programas

// Sintaxis

// fun nombreDeFuncion() [ //acá va el código]
fun

 */

fun saludaPepe(){
    var nombre: String = "pepe"
    println("hola soy $nombre")

    /**
     * !) Crear una función miSaludo() que imprima "Hola soy su-nombre"
     *
     */
}

fun main(){
    saludaPepe()
    miSaludo()
}


fun miSaludo(){
    var nombre: String = "rodolfo"
    println("Hola soy $nombre")
}


