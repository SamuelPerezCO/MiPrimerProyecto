package org.example

fun main(args: Array<String>){
    var nombre: String? = null
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)

//    El Elvis operator en Kotlin (?:) se usa para manejar valores nulos. Si la expresión de la izquierda no es nula, se usa ese valor; si es nula, se usa el valor de la derecha.
}