package com.rodolfo.cfp401.cursoaplicacionesmoviles.Modulo1

fun promedio(nota1: Int, nota2: Int, nota3: Int): Float {

    return (nota1 + nota2 + nota3) / 3.0f
}

fun main() {
    // val nota1 = 10
    // val nota2 = 7
    //  val nota3 = 5
    //val suma = nota1 + nota2 + nota3
    // val promedio = suma/3
    println("Promedio de notas (${promedio(10,5, 7)})")
}