package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO

class Estudiante (val nombre: String,  var curso: String) {
    var promedio  = 0.0f
    val notas = mutableListOf<Int>()

    fun rendirExamen(nota: Int){
        notas.add(nota)
    }
}
fun main(){

}
