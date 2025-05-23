package org.example

const val PI = 3.1416
fun main(args: Array<String>){
    println("Hello World")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Maria"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double = 2.71182
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "Vetri"
    val giuseppe = "Giuseppe"
    val nombreCompleto =  "Mi nombre es $giuseppe $apellido"
    println(nombreCompleto)
}