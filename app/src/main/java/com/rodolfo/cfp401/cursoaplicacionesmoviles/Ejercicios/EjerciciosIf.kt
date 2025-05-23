package com.rodolfo.cfp401.cursoaplicacionesmoviles.Ejercicios
//
//fun main(){
 //   var edad: Int = 17
 //   var permiso: Boolean = false
 //   println(sacarRegistro(edad, permiso))
//}

//fun sacarRegistro(edad: Int, permiso: Boolean): String{
 //   return if (edad>=18 || permiso) "Ud. puede sacar registro"
 //   else "Vuelva cuando Ud. sea mayor de edad o tenga permiso"
//}
// EJERCICIOS MAXI - OPERACIONES BASICAS

fun main(){
    calcular(5.2, 3.0,'+')
}

fun calcular(a: Double, b: Double, operador: Char){
    when(operador){
       '+' -> println(a + b)
        '-' -> println(a - b)

        else -> println("operación fuera de tipo")
    }
}

