package org.example

import java.util.Locale
import java.util.Locale.getDefault

fun main(args: Array<String>){
    val fraseAleatoria = "En Platzi nuna paramos de aprender"
    imprimirFrase(randomCase(fraseAleatoria))
}

fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es : $frase")
}

fun randomCase(frase : String) : String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        frase.uppercase(getDefault())
    } else {
        frase.lowercase(getDefault())
    }
}
