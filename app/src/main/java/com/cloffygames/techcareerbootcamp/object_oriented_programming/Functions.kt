package com.cloffygames.techcareerbootcamp.object_oriented_programming

class Functions {
    //void : geri dönüş değeri olmayan

    var message: String? = null

    lateinit var text: String

    lateinit var primitive: String//Double,vb

    fun selamla() {
        val mesaj = "Merhaba"
        println(mesaj)
    }

    //return : geri dönüş değeri olan

    fun selamlaReturn() : String {
        val mesaj = "Merhaba"

        return mesaj
    }

    //parametreli fonksiyon
    fun selamlaParametre(isim: String) {
        val mesaj = "Merhaba"
        println("$mesaj $isim")

    }

    //overloading
    fun carp(sayi1: Int, sayi2: Int) {
        println("Çarpma : ${sayi1 * sayi2}")

    }

    fun carp(sayi1: Double, sayi2: Double) {//aynı isimli fonksiyon fakat farklı parametre tipleri
        println("Çarpma : ${sayi1 * sayi2}")

    }

    fun carp(sayi1: Int, sayi2: String) {
        println("Çarpma : ${sayi1 * sayi2.toInt()}")
    }

}