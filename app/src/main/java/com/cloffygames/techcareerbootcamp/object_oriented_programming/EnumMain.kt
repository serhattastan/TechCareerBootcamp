package com.cloffygames.techcareerbootcamp.object_oriented_programming

fun main() {
    konserveFiyat(KonserveBoyut.ORTA, 55)

}

fun konserveFiyat(boyut : KonserveBoyut, adet : Int){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam maliyet : ${adet * 130}₺")
        KonserveBoyut.ORTA -> println("Toplam maliyet : ${adet * 210}₺")
        KonserveBoyut.BUYUK -> println("Toplam maliyet : ${adet * 460}₺")
    }

}