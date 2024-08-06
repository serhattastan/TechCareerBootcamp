package com.cloffygames.techcareerbootcamp.variables

import kotlin.math.round

fun main() {
    // Hello World
    /*
    println("Hello, Kotlin!")
    val name = "World!"
    println("Hello, $name!")
     */

    // Değişkenler
    /*
    var productName = "MacBook Pro"
    var productPrice = 2000
    var productStock = 10
    var productStatus = true
    println("Ürün Adı: $productName")
    println("Ürün Fiyatı: ${productPrice * 2} ₺")
    println("Ürün Stok: $productStock")
    println("Ürün Durumu: $productStatus")
     */

    //Sabitler -Constant
    //Swift let , Java-Dart final
    /*
    //var Kullanımının Avantajı Değiştirilebilirlik
    var number = 10
    println(number)
    number = 20
    println(number)

    //val Kullanımının Avantajı Değiştirilemezlik
    val pi = 3.14
    println(pi)
    //pi = 3.15
    //println(pi)
     */

    //Type Casting - Veri tipi dönüşümü
    //Arayüzde görünecek olan değer String veri tipinde olmalıdır.

    //Sayısaldan Sayısala
    var number = 20
    var numberDouble = number.toDouble()
    println(numberDouble)

    //Double to Int
    var pi = 3.14
    var piInt = pi.toInt()
    println(piInt)

    //Sayısaldan Metine
    var numberString = number.toString()
    println(numberString)

    //Double to String
    var piString = pi.toString()
    println(piString)

    //Metinden Sayısala
    var input = "65"
    var inputInteger = input.toIntOrNull()
    if (inputInteger != null) {
        println(inputInteger)
    } else {
        println("Geçersiz sayı")
    }

    inputInteger?.let {
        println(it)
    }

}

