package com.cloffygames.techcareerbootcamp.inheritence

fun main() {
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,50)
    val ev = Ev(3)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    println(ev.pencereSayisi)
}