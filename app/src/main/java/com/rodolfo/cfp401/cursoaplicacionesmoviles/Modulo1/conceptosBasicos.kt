/*package com.rodolfo.cfp401.cursoaplicacionesmoviles.Modulo1

fun ejercicio1(){

   println("Use the val keyword when the value doesn't change.")
   println("Use the var keyword when the value can change.")
   println("When you define a function, you define the parameters that can be passed to it.")
   println("When you call a function, you pass arguments for the parameters.")
}


fun main(){
    ejercicio1()
}
*/
/*
fun ejercicio1() {
    val firstNumber = 10
    val secondNumber = 5
    val result = (firstNumber + secondNumber)
    println("$firstNumber + $secondNumber = $result")
}
*/
fun potencia(base: Int, exponente: Int): Int {
    var resultado = 1
    var contador = 1
    while (contador < exponente) {
        resultado = resultado * base
    }
    return resultado

    /*
    var resultado = potencia(4, 2)
    println(resultado)
    if (resultado == 16) println("Correcto")
    else println("Vuelva a intentar")
    */
}


fun ejercicio7(){
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int  {
    return firstNumber + secondNumber
}
fun ejercicio71(){
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = subtract(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun subtract(firstNumber: Int, secondNumber: Int): Int  {
    return firstNumber - secondNumber
}
fun ejercicio8(){
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

}
fun displayAlertMessage(operatingSystem: String, emailId: String): String{
    return  "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun main() {
    ejercicio8()
}
