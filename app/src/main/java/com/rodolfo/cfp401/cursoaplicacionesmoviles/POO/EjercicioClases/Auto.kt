package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO.EjercicioClases

class Auto (val marca: String, val modelo: String, val año: Int){
    fun mostrarDatos(){
        println("El auto es marca: $marca, modelo: $modelo, año:$año")
    }
}
fun main(){
    val auto =  Auto("Ford", "Ranger", 2003, )
    auto.mostrarDatos()
}