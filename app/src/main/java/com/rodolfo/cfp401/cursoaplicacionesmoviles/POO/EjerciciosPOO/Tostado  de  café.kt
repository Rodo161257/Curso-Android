package com.rodolfo.cfp401.cursoaplicacionesmoviles.POO.EjerciciosPOO

class Comida(val celiaco: Float,
             val cantCeliaco: Int,
             val vegano: Float,
             val cantVegano: Int,
             val servicio: String,
             val pago: String){

    fun costoComida(): Float{

        val costo = celiaco * cantCeliaco + vegano*cantVegano
        println("Comida: Celiaco: $$celiaco, Cantidad:$cantCeliaco, Vegano: $$vegano, Cantidad: $cantVegano")
        println("Servicio: $servicio, Pago: $pago")
        println("El costo de la comida es de $ $costo")
        return costo
    }
}

class Bebida(val jugoFrio: Float,
             val cantjugoFrio: Int,
             val cafeCaliente: Float,
             val cantcafeCaliente: Int,
             val cafeFrio: Float,
             val cantcafeFrio: Int,
             val servicio: String,
             val pago: Float){

    fun costoBebida(): Float {

        val costo = jugoFrio*cantjugoFrio + cafeCaliente*cantcafeCaliente + cafeFrio*cantcafeFrio*0.9
        println("Bebidas: Jugo frio: $$jugoFrio, Cantidad:$cantjugoFrio, Cafe Caliente: $$cafeCaliente, Cantidad:$cantcafeCaliente, Cafe Frio: $$cafeFrio, Cantidad:$cantcafeFrio")
        println("Servicio: $servicio, Pago: $pago")
        println("El costo de las bebidas es $$costo")

        return costo.toFloat()
    }
    fun calcularDescuento(){
        if(cantcafeFrio>0)
            println("Café frio tiene descuento del 10%")
        if (pago > 0f) println("El servicio tiene un pago de $$pago")


    }
}
fun main() {
    val comida = Comida(100f, 1, 200f, 1, "local", "pendiente")
    comida.costoComida()
    val bebida = Bebida(150f, 1, 200f, 1, 100f, 1, "local", 100f)
    bebida.costoBebida()
    bebida.calcularDescuento()
    println("Costo Total bebida + comida = ${bebida.costoBebida() + comida.costoComida()}")

}

