package com.cloffygames.techcareerbootcamp.standart_programming

fun main() {
    val age = 17
    val name = "Serhat"

    //if else
    if (age >= 18) {
        println("Reşitsin $name")
    }else {
        println("Reşit değilsin $name")
    }

    //String ile if else kullanımı
    if (name == "Serhat") {
        println("Merhaba $name")
    }else{
        println("Tanınmayan Kullanıcı")
    }

    val ka = "admin"
    val sifre = "12345"
    if (ka == "admin" && sifre == "12345") {
        println("Hoşgeldin $ka")
    }else{
        println("Hatalı Giriş")
    }

    val number = 11

    if(number == 10 || number == 20){
        println("Sayı 10 veya 20")
    }else{
        println("Sayı 10 veya 20 değil")
    }

    //Switch Case
    val num = 1

    when(num) {
        1 -> println("Sayı 1")
        2 -> println("Sayı 2")
        3 -> println("Sayı 3")
        else -> println("Sayı yok")
    }
}