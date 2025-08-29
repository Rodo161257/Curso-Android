package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO

abstract class Instrumento {

    abstract fun tocar()
}
class Guitarra(val cuerdas: Int, val color: String) : Instrumento() {
    fun imprimir() {
        println("El instrumento Guitarra tiene $cuerdas cuerdas y es de color $color")
    }
    override fun tocar() {
        println("Tocando la guitarra")
    }
}
class Bateria(val platillos: Int, val bombos: Int) : Instrumento() {
    fun imprimir() {
        println("La bería tiene $platillos platillos y $bombos bombos")
    }
        override fun tocar() {
            println("Tocando la guitarra")
        }
}
fun main(){
    val bateria = Bateria(5, 3)
    val guitarra = Guitarra(6, "beige")
    bateria.imprimir()
    guitarra.tocar()
}

