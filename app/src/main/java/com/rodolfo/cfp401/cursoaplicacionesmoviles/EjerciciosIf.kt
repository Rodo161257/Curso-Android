package com.rodolfo.cfp401.cursoaplicacionesmoviles

fun main(){
    var edad: Int = 17
    var permiso: Boolean = false
    println(sacarRegistro(edad, permiso))
}

fun sacarRegistro(edad: Int, permiso: Boolean): String{
    return if (edad>=18 || permiso) "Ud. puede sacar registro"
    else "Vuelva cuando Ud. sea mayor de edad o tenga permiso"
}

