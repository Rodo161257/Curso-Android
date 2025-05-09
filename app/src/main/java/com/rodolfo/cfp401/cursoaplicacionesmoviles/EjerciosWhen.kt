package com.rodolfo.cfp401.cursoaplicacionesmoviles

/*fun main(){
    clasificarEdad(8)
    clasificarEdad(15)
    clasificarEdad(25)
    clasificarEdad(66)
}

 */

fun clasificarEdad(edad: Int){
    when(edad){
        in 0..13 ->println("$edad años es un Niño")
        in 14..17 ->println("$edad años es un Adolescente")
        in 18..64 ->println("$edad años es un Adulto")
        in 65..130 ->println("$edad años es un Adulto mayor")
        else -> println("Sujeto no categorizado")
    }
}

fun clasificarEdadIf(edad:Int){

    if (edad>=0 && edad<=13) println("Niño")
    else if(edad >=13 && edad<=17) println("Adolescente")
    else if(edad >=19 && edad<=64) println("Adulto")
    else if(edad>=65) println("Adulto mayor")
    else println("Sujeto no categorizado")
}

// Ejercicio 2: dado un número del 1 al 7 devolver el nombre del día

fun main(){
    nombreDelDia(8)
}
fun nombreDelDia(numero: Int){
    when(numero){
        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("miercoles")
        4 -> println("jueves")
        5 -> println("viernes")
        6 -> println("sabado")
        7 -> println("domingo")
        else -> println("No es día de la semana")
    }

    }






