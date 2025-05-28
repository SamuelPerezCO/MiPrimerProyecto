package org.example

fun main(args: Array<String>){
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("EL amarillo es el color de la alegria")
        "Rojo" , "Carmesi" -> println("Este color simboliza el calor")
        else -> println("Error. No tengo informacion del color")
    }

    val code = 200
    when(code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido , algo ha fallado.")
    }

    val tallaDeZapatos = 41
    val mensaje = when(tallaDeZapatos){
        41 , 43 -> "Tenemos Disponible"
        42 , 44 -> "Casi no nos quedan!"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos Zapatos solo vienen en tallas 41 , 42 , 43 , 44 y 45"
    }

    println(mensaje)
}