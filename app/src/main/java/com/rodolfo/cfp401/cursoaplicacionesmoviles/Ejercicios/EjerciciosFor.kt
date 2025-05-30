package com.rodolfo.cfp401.cursoaplicacionesmoviles.Ejercicios

import kotlin.random.Random

fun ejercicio1(){
    for(i in 1..10) print("$i ")
}


fun ejercicio2() {
    var i: Int = 5
    while (i <= 15) {
        print("$i")
        i++
    }

}

fun ejercicio9(){
    val adivinalo: Int = Random.nextInt(1, 50)
    println("Adivine un número entre 1 y 50")
    var input:  Int = readln().toInt()
    while (adivinalo != input){
        if(input<adivinalo) println("el número ingresado es menor")
        else println("el número ingresado es mayorr")
        input = readln().toInt()
    }
    println("Felicitaciones ganaste")
}
fun ejercicio10(){
    var numero = 10
    while(numero>=0){
        println(numero)
        numero--
    }
    println("Despegue!!!!")
}
fun main(){
    ejercicio10()
}
