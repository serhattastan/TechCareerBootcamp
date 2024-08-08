package com.cloffygames.techcareerbootcamp.object_oriented_programming

data class Products (var id:Int, var name:String, var price:Double, var description:String){

    init {//Constructor
        //Bu sınıftan nesne oluşturulduğu anda çalıştırılacak kodlar
        println("Ürün nesnesi oluşturuldu")


    }

    fun info(){
        println("\nId: $id")
        println("Name: $name")
        println("Price: $price")
        println("Description: $description")
    }

    // this : bulunduğu sınıfın referansı
    // super : Kalıtım yoluyla gelen üst sınıfın referansı

}