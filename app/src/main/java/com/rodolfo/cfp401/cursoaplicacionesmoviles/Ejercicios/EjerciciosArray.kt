package com.rodolfo.cfp401.cursoaplicacionesmoviles.Ejercicios
//Ejercicio 1: crear y mostar 5 números

fun ejercicioArray1(){
    val enteros = intArrayOf(10, 25, 7, 15, 3)
    for(numero in enteros){
        println(numero)}
}

fun ejercicioArray2(){
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val sum = numbers.sum()
    println("La suma de los elementos es: $sum")
}
fun ejercicioArray20(){
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var parcial = 0
    for(elem in numbers) {
        parcial = parcial + elem
    }
    println("La suma total es $parcial")

}
fun ejercicioArray3(){
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val maximo = numeros.maxOrNull()
    val minimo = numeros.minOrNull()
    println("El valor máximo es: $maximo")
    println("El valor mínimo es: $minimo")
}





fun main (){
    ejercicioArray2()
}