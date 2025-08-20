package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO
/*
class Triangulo{
    var lado1 = Int
    var lado2 = Int
    var lado3 = Int

    fun Inicializar() {
        print("Ingrese lado 1:")
        lado1 = readln().toInt()
        print("Ingrese lado 2")
        lado2 = readln().toInt()
        print("Ingrese lado 3")
        lado3 = readln().toInt()

        fun ladoMayor() {
            println("Lado mayor: ")
            when {
                lado1 > lado2 && lado1 > lado3 -> println("Lado 1")
                lado2 > lado1 && lado2 > lado3 -> println("Lado 2")
                else println ("Lado 3")
            }
        }


    }
}
*/
/*Problema propuesto
Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota. Definir los métodos para
inicializar sus propiedades por teclado, imprimirlos y mostrar un mensaje si está regular (nota mayor o igual a 4)
Definir dos objetos de la clase Alumno.

 */
/*
classAlumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno:")
        nombre = readln().toString()
        print("Ingrese su nota:")
        nota = readln().toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}

fun main(parametros: Array<String>) {
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.mostrarEstado()
    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.mostrarEstado()
}


class Alumno(var nombre: String, var nota: Int) {

    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }


    fun imprimir() {
        println("Nombre: $nombre y  tiene una nota de $nota")
    }

    fun mostrarEstado() {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no es REGULAR")
    }
}

fun main(parametro: Array<String>) {
    val alumno1 = Alumno("Juan", 3)
    alumno1.imprimir()
    alumno1.mostrarEstado()
    val alumno2 = Alumno("Pedro", 9)
    alumno2.imprimir()
    alumno2.mostrarEstado()

}
*/

