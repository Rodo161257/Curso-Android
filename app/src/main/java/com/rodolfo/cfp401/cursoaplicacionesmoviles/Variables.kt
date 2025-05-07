package com.rodolfo.cfp401.cursoaplicacionesmoviles

import com.google.android.material.transition.MaterialSharedAxis

fun main(){
  println ("Hola mundo")
    println ("Hola Rodolfo")
    // Valores inmutables
    val edad:Int = 67
    val altura:Double = 1.70
    val nombre: String = "Rodolfo"

    //Char es un sólo caracter y va con comillas simples ¨´

    val miInicial: Char = 'R'
    println("Hola soy $nombre, mi nombre empieza con $miInicial, tengo $edad años y mido $altura metros")

//  Variables mutables
  var cantAlumnos: Int // Declato variable
      cantAlumnos = 6 // Inicializo
      println("Hasta ahora llegaron $cantAlumnos")
      cantAlumnos += 1 // es igual a lo de arriba
      println ("Ahora son $cantAlumnos")

  // Operadores
  // Aritmeticos
  var num1: Int = 17
  var num2: Int = 15
  var resultado: Int = num1 + num2
  println("Suma:$resultado:Int")

  resultado =  num1 - num2
  println()

}








