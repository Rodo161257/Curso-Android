package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO.EjerciciosPOO

class Comida(val celiaco: Float,
             val cantCeliaco: Int,
             val vegano: Float,
             val cantVegano: Int,
             val servicio: String,
             val pago: String){

    fun costoComida(){

        val costo = celiaco * cantCeliaco + vegano*cantVegano
        println("Comida: Celiaco: $$celiaco, Cantidad:$cantCeliaco, Vegano: $$vegano, Cantidad: $cantVegano")
        println("Servicio: $servicio, Pago: $pago")
        println("El costo de la comida es de $ $costo")
    }
}

class Bebida(val jugoFrio: Float,
             val cantjugoFrio: Int,
             val cafeCaliente: Float,
             val cantcafeCaliente: Int,
             val cafeFrio: Float,
             val cantcafeFrio: Int,
             val servicio: String,
             val pago: String){

    fun costoBebida(){

        val costo = jugoFrio*cantjugoFrio + cafeCaliente*cantcafeCaliente + cafeFrio*cantcafeFrio*0.9
        println("Bebidas: Jugo frio: $$jugoFrio, Cantidad:$cantjugoFrio, Cafe Caliente: $$cafeCaliente, Cantidad:$cantcafeCaliente, Cafe Frio: $$cafeFrio, Cantidad:$cantcafeFrio")
        println("Servicio: $servicio, Pago: $pago")
        println("El costo de las bebidas es $$costo")
    }
}
fun main() {
    val comida = Comida(100f, 1, 200f, 1, "local", "pendiente")
    comida.costoComida()
    val bebida = Bebida(150f, 1, 200f, 1, 100f, 1, "local", "pendiente")
    bebida.costoBebida()

}


