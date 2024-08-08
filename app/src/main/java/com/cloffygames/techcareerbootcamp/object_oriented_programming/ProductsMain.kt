package com.cloffygames.techcareerbootcamp.object_oriented_programming

import com.cloffygames.techcareerbootcamp.tasks.Product

fun main() {
    val product1 = Products(1, "TV", 1500.0, "Elektronik")
    //Değer Erişimi
    println("Id : ${product1.id}")
    println("Name : ${product1.name}")
    println("Price : ${product1.price}")
    println("Description : ${product1.description}")

    product1.info()

    val product2 = Products(2, "Laptop", 2500.0, "Elektronik")
    println("\nId : ${product2.id}")
    println("Name : ${product2.name}")
    println("Price : ${product2.price}")
    println("Description : ${product2.description}")

    product2.price = 3000.0
    println(product2.price)

    product2.info()

}