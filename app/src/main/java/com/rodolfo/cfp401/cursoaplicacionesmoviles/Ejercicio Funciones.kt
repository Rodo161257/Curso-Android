package com.rodolfo.cfp401.cursoaplicacionesmoviles

fun areaRectangulo(base: Double, altura: Double): Double{
    return base * altura
}

fun main(){
    println(areaRectangulo(4.5, 5.0))
    println(convertirCelsiusAFarenheit(celsius = 0.0))
}

fun convertirCelsiusAFarenheit(celsius: Double): Double{
    return (celsius * 9/5) + 32
}
