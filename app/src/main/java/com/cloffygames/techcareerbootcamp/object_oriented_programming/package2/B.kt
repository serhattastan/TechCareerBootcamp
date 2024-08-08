package com.cloffygames.techcareerbootcamp.object_oriented_programming.package2

import com.cloffygames.techcareerbootcamp.object_oriented_programming.package1.A //Farklı paketten sınıfı import etme

class B {
    fun method() {
        val a = A()

        a.publicDegisken
        a.varsayilanDegisken
    }
}