package com.cloffygames.techcareerbootcamp.object_oriented_programming

fun main() {

    var num1 = 5 carp 4
    println(num1.carp(4))

}

infix fun Int.carp(sayi: Int): Int {

    return this * sayi
    //this = Int
}