

/*
class Socio(
   nombreCompleto: String,
   private val fechaNacimiento: LocalDate,
   fechaIngreso: LocalDate,
   private val servicios: MutableList<Servicio> = mutableListOf()
): Persona(nombreCompleto, fechaIngreso)
{
   fun montoAPagarEnFecha(fecha: LocalDate): Float {
       var costoParcial = 0f
       for(servicio in this.servicios){
           if(servicio.igualFechas(fecha))
               costoParcial += servicio.calcularCosto()
       }
       return costoParcial
   }
   fun aplicarDescuento(): Boolean {
       return servicios.size >= 5
   }
}

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Entrenador(
   nombreCompleto: String,
   fechaIngreso: LocalDate,
   private val honorariosManiana: Float,
   private val honorariosTarde: Float
): Persona(nombreCompleto, fechaIngreso) {

   fun honorario(esDeManiana: Boolean): Float {
       return if(esDeManiana) honorariosManiana else honorariosTarde
   }
   fun antiguedad(): Int {
       return calcularDiferenciaEnAños(fechaIngreso, LocalDate.now()).toInt()
   }

   private fun calcularDiferenciaEnAños(inicio: LocalDate, fin: LocalDate): Long {
       return ChronoUnit.YEARS.between(inicio, fin)
   }
}

import java.time.LocalDate
abstract class Servicio(protected val fecha: LocalDate) {
   abstract fun calcularCosto(): Float

   fun igualFechas(fecha: LocalDate): Boolean {
       return this.fecha.isEqual(fecha)
   }
}
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
abstract class Clase (
   fecha: LocalDate,
   protected val horaInicio: LocalTime,
   protected val entrenador: Entrenador
): Servicio(fecha) {

   private fun esDomingo(fecha: LocalDate): Boolean {
       return fecha.dayOfWeek == DayOfWeek.SUNDAY
   }


   private fun iniciaEnManiana(hora: LocalTime): Boolean{
       val inicio = LocalTime.of(7,0) // 7:00 AM
       val fin = LocalTime.of(12,0) // 12:00 PM
       return !hora.isBefore(inicio) && !hora.isAfter(fin)
   }
}

import java.time.LocalDate
import java.time.LocalTime


class ClasePersonalizada(
   fecha: LocalDate,
   horaInicio: LocalTime,
   entrenador: Entrenador,
   private val socio: Socio
): Clase(fecha, horaInicio, entrenador) {
   override fun calcularCosto(): Float {
       val honorariosEntrenador = entrenador.honorario(this.iniciaEnManiana(this.horaInicio))
       val adicionalDomingo = if(this.esDomingo(this.fecha)) 500f else 0f
       val adicionalAntiguedadEntrenador = entrenador.antiguedad() * 400f


       return honorariosEntrenador + adicionalDomingo + adicionalAntiguedadEntrenador


   }
}

import java.time.LocalDate
import java.time.LocalTime


class ClaseGrupal(
   private val socios: List<Socio>,
   fecha: LocalDate,
   horaInicio: LocalTime,
   entrenador: Entrenador
): Clase(fecha,horaInicio, entrenador) {


   override fun calcularCosto(): Float {
       val honorariosEntrenador = entrenador.honorario(iniciaEnManiana(horaInicio)) / socios.size
       val adicionalDomingo = if(esDomingo(fecha)) 800f else 0f
       val adicionalAntiguedad = (entrenador.antiguedad() * 250f) / socios.size
       return honorariosEntrenador + adicionalDomingo + adicionalAntiguedad
   }
}

import java.time.LocalDate


class UsoLibre(
   fecha: LocalDate,
   private val socio: Socio,
   private val cantHoras: Int
): Servicio(fecha) {
   override fun calcularCosto(): Float {
       val descuento = if(socio.aplicarDescuento()) 0.90f else 1f
       return (300 * cantHoras) * descuento
   }
}


Testing

TestEntrenador
import java.time.LocalDate
fun main(){


   val entrenador = Entrenador("Prueba",LocalDate.of(2021,5,24), 300f, 500f)


   fun testAntiguedad(): Boolean {
       return entrenador.antiguedad() == 4
   }


   fun testHonorario():Boolean {
       return entrenador.honorario(true) == 300f
               && entrenador.honorario(false) == 500f
   }


   println(testHonorario() && testAntiguedad())
}
        */