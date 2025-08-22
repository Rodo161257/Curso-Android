package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO.EjerciciosPOO

class CuentaBancaria(val titular: String) {



    fun depositar(cantidad: Float) {
        println("$titular depositó $ $cantidad ")
    }

    fun extraer(cantidad: Float) {
        println("$titular extrajo $ $cantidad ")
    }

    fun neto(cantidad: Float) {

    }

}


fun main() {
    val countBank = CuentaBancaria("Perez")
    countBank.depositar(100f)
    countBank.extraer(50f)


}