package com.cloffygames.techcareerbootcamp.standart_programming

fun main() {
    //1,2,3
    for (i in 1..3) {
        println("Döngü : $i")
    }

    //10 ile 20 arasında 5'er 5'er artarak
    for (i in 10..20 step 5) {
        println("Döngü : $i")
    }

    //20 ile 10 arasında 5'er 5'er azaltarak
    for (i in 20 downTo 10 step 5) {
        println("Döngü : $i")
    }

    //While
    var i = 0
    while (i < 5) {
        println("Döngü : $i")
        i++
    }

    //Break
    for (i in 1..3) {
        if (i == 2) {
            break //2'yi görünce döngüden çıkar
        }
        println("Döngü 2 : $i")
    }

    //Continue
    for (i in 1..3) {
        if (i == 2) {
            continue //2'yi atlar
        }
        println("Döngü 3 : $i")
    }

}