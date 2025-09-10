package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO.Gimnasio

import java.time.LocalDate

class Entrenador(
    private val honorarioMañana: Float,
    private val horarioTarde: Float,
    nombre: String,
    fechaIngreso: LocalDate
): Persona(nombre, fechaIngreso) {
    fun antiguedad(): Int{
        return 0
    }
}