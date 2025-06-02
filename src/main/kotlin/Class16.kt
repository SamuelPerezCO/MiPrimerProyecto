package org.example

fun main(args: Array<String>){
    val listaDeFrutas = listOf("Manzana" , "Pera" , "Frambuesa" , "Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")
    listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva llamada $fruta")}

    val caracteresDeFruta = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}