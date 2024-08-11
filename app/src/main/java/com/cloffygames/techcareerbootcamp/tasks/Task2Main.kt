package com.cloffygames.techcareerbootcamp.tasks

import java.util.Scanner

fun main() {

    /************************************** Fahrenheit to Celsius ***************************************/
    val fahrenheit = 100.0
    val celsius = fahrenheitToCelsius(fahrenheit)
    println("\n\n$fahrenheit Fahrenheit = $celsius Celsius")



    /************************************** Dikdörtgen Çevre Hesabı ***************************************/
    calculateRectanglePerimeter(5.0, 3.0)



    /************************************** Faktöriyel Hesabı ***************************************/
    val number = 5
    val factorial = calculateFactorial(number)
    println("\n\n$number! = $factorial")



    /*************************************** Kelimenin İçinde Kaç Tane A Olduğunu Bulma ***************************************/
    val word = "Ankara"
    countAInWord(word)

    /************************************** Maaş Hesabı ***************************************/
    val daysWorked = 30
    val salary = calculateSalary(daysWorked)
    println("\n\nÇalışılan $daysWorked gün için maaş: $salary ₺")



    /************************************** İç Açıların Toplamını Bulma ***************************************/
    val sides = 5
    val interiorAngleSum = calculateInteriorAngleSum(sides)
    println("\n\n$sides kenarlı çokgenin iç açılar toplamı: $interiorAngleSum derece")

    /************************************** İnternet Kota Hesaplama ***************************************/
    val usageInGB = 100
    val quotaCost = calculateQuotaCost(usageInGB)
    println("\n\nİnternet kullanımı: $usageInGB GB\nToplam ücret: $quotaCost ₺")
//    println("\n\nİnternet kullanımı: $usageInGB GB\nToplam ücret: ${calculateQuotaCost(usageInGB)} ₺")



    /************************************** Genel Sıcaklık Dönüşümü ***************************************/
    tempConvert()

}

fun tempConvert(){
    /************************************** Kullanıcıdan Girdi Alıp Derece Dönüşümü Yapma ***************************************/

    //Bu fonksiyonu bonus olarak yapmak istedim.
    //Kullanıcıdan girdi alınarak yapılacak dönüşüm türü belirlenir ve girilen değerler doğrultusunda ilgili dönüşüm yapılır.

    val scanner = Scanner(System.`in`)

    // Kullanıcıdan sıcaklık değeri alınır
    print("\nLütfen dönüştürmek istediğiniz sıcaklık değerini girin: ")
    val value = scanner.nextDouble()

    // Kullanıcıdan mevcut sıcaklık birimi alınır
    print("Lütfen mevcut sıcaklık birimini seçin (1: Fahrenheit, 2: Celsius, 3: Kelvin): ")
    val fromUnit = scanner.nextInt()

    // Kullanıcıdan hedef sıcaklık birimi alınır
    print("Lütfen dönüştürmek istediğiniz birimi seçin (1: Fahrenheit, 2: Celsius, 3: Kelvin): ")
    val toUnit = scanner.nextInt()

    // Dönüşüm gerçekleştirilir
    val convertedValue = temperatureConverter(value, fromUnit, toUnit)

    // Birim isimlerini almak için fonksiyon kullanılır
    val fromUnitName = getUnitName(fromUnit)
    val toUnitName = getUnitName(toUnit)

    // Sonuç ekrana yazdırılır
    println("\n\nSonuç: $value $fromUnitName, $convertedValue $toUnitName olarak dönüştürüldü.")
}