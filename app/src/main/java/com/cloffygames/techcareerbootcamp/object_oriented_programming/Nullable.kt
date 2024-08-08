package com.cloffygames.techcareerbootcamp.object_oriented_programming

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    var message: String? = null //Nullable

    message = "Hello Kotlin"

    //Kullanim yöntemi 1
    println("Yöntem 1: ${message?.uppercase()}")

    //Kullanim yöntemi 2
    println("Yöntem 1: ${message!!.uppercase()}")

    //Kullanim yöntemi 3
    if (message != null) {
        println("Yöntem 3: ${message.uppercase()}")
    }else{
        println("Yöntem 3: null")
    }

    //Kullanim yöntemi 4
    message?.let {
        println("Yöntem 4: ${message.uppercase()}")
    } ?: run {
        println("Yöntem 4: null")
    }


}