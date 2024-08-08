package com.cloffygames.techcareerbootcamp.tasks

// Ürünler Tablosu
data class Product(
    val id: Int,
    val productName: String,
    var stockQty: Int,
    val brand: String,
    val rating: Float,
    val review: String,
    val colorId: Int,
    val weight: Double
)

// Renkler Tablosu
data class Color(
    val id: Int,
    val colorName: String
)

// Siparişler Tablosu
data class Order(
    val id: Int,
    val orderQty: Int,
    val payment: Double,
    val paymentDate: String,
    val trackingCode: String,
    val couponCode: String?
)

// Müşteriler Tablosu
data class Customer(
    val id: Int,
    val customerName: String,
    val city: String,
    val country: String,
    val phone: String,
    val email: String,
    val postalCode: String,
    val maritalStatus: String,
    var balance: Double
)

// Kampanyalar Tablosu
data class Campaign(
    val id: Int,
    val couponCode: String,
    val couponDuration: Int
)

/*************************************************************************************************************
 *                                               İÇİNDEKİLER
 *
 *  1. Ürünler Tablosu İşlemleri -----------------------------------------------------------------------------> 74-114
 *      - Ürün Listesini Görüntüleme
 *      - Ürün Stok Durumu Kontrolü
 *  2. Müşteri İşlemleri -------------------------------------------------------------------------------------> 114-139
 *      - Müşteri Bakiyelerinin Güncellenmesi
 *  3. Kampanya İşlemleri ------------------------------------------------------------------------------------> 139-155
 *      - Kupon Geçerliliği Kontrolü
 *  4. Sipariş İşlemleri -------------------------------------------------------------------------------------> 155-173
 *      - Toplam Ödeme Miktarının Hesaplanması
 *  5. Araba Uygunluk Değerlendirmesi ------------------------------------------------------------------------> 173-198
 *  6. Kredi Başvuru Değerlendirmesi -------------------------------------------------------------------------> 198-242
 *  7. String İşlemleri --------------------------------------------------------------------------------------> 242-271
 *  8. Switch Case (When) Kullanımı --------------------------------------------------------------------------> 271-287
 *  9. Null Safety -------------------------------------------------------------------------------------------> 287-293
 * 10. While Döngüsü -----------------------------------------------------------------------------------------> 293-302
 *
 *************************************************************************************************************/

fun main() {

    /**************************************************** Ürünler Tablosu ********************************************************/


    // Ürünler Listesi
    val products = listOf(
        Product(1, "MacBook Pro M99 Pro", 5, "MacBook", 4.5f, "300 günlük pil kapasitesi", 1, 1.5),
        Product(2, "Logitech 9999", 15, "Logitech", 4.7f, "Işıklı mışıklı fare", 2, 0.1),
        Product(3, "Samsung Galaxy S777 Pro", 1, "Samsung", 4.1f, "Bir cisim yaplaşıyor efendim!", 2, 0.2),
        Product(4, "4:16 Ultra HD TV", 3, "Philips", 2.1f, "İttirgeçli götürgeç", 2, 0.2),
        Product(5, "Sony PlayStation 99", 10, "Sony", 4.9f, "GTA6 çıksa da oynasak", 3, 3.5),
        Product(6, "Huawei MateBook X Ultra", 7, "Huawei", 4.3f, "Lorem ipsum dolor sit amet", 1, 1.2)
    )

    // 1. Ürün Listesini Görüntüleme
    // Bu kısımda ürün listesindeki tüm ürünlerin özellikleri görüntüler.
    println("Ürün Listesi:\n" + "-".repeat(50))
    products.forEach { product ->
        println(
            """
            Ürün ID: ${product.id}
            Ürün Adı: ${product.productName}
            Marka: ${product.brand}
            Stok Miktarı: ${product.stockQty}
            Puan: ${product.rating}
            İnceleme: ${product.review}
            Ağırlık: ${product.weight} kg
            """.trimIndent()
        )
        println("-".repeat(50))
    }

    // 2. Ürün Stok Durumu
    // Ürünlerin stok miktarları kontrol edilir ve düşük stok durumu hakkında bilgi verir.
    println("\nStok seviyeleri kontrol ediliyor...")
    for (product in products) {
        if (product.stockQty < 10) {
            println("Düşük stok: ${product.productName}")
        }
    }

    /**************************************************** Müşteri İşlemleri ********************************************************/


    // Müşteri Listesi
    val customers = listOf(
        Customer(1, "Ayşe", "İstanbul", "Türkiye", "05321234567", "ayse@example.com", "34000", "Bekar", 100.0),
        Customer(2, "Ali", "Ankara", "Türkiye", "05449876543", "ali@example.com", "06000", "Evli", 50.0),
        Customer(3, "Fatma", "İzmir", "Türkiye", "05349876543", "fatma@example.com", "35000", "Bekar", 75.0),
        Customer(4, "Mehmet", "Bursa", "Türkiye", "05431234567", "mehmet@example.com", "16000", "Evli", 120.0),
        Customer(5, "Can", "Antalya", "Türkiye", "05327654321", "can@example.com", "07000", "Bekar", 60.0),
        Customer(6, "Elif", "Adana", "Türkiye", "05320987654", "elif@example.com", "01000", "Evli", 90.0)
    )

    // 3. Müşteri Bakiye Güncelleme
    // Müşterilerin bakiyeleri güncellenir ve sonuçlar listelenir.
    println("\nMüşteri bakiyeleri güncelleniyor...")
    var index = 0
    while (index < customers.size) {
        customers[index].balance += 10.0 // Her müşteriye 10 ekliyoruz
        index++
    }

    println("Güncellenmiş müşteri bakiyeleri:")
    customers.forEach { println("${it.customerName}: ${it.balance} TL") }

    /**************************************************** Kampanya İşlemleri ********************************************************/


    // Kampanya
    val campaign = Campaign(1, "INDIRIM10", 30)
    val customerCoupon = "INDIRIM10"

    // 4. Kampanya Kuponu Kontrolü
    // Müşterinin kupon kodunun geçerli olup olmadığını kontrol eder.
    println("\nKupon geçerliliği kontrol ediliyor...")
    if (customerCoupon == campaign.couponCode) {
        println("Kupon geçerli!")
    } else {
        println("Kupon geçersiz!")
    }

    /**************************************************** Sipariş İşlemleri ********************************************************/


    // Siparişler Listesi
    val orders = listOf(
        Order(1, 2, 100.0, "2024-08-07", "TAKIP123", null),
        Order(2, 1, 50.0, "2024-08-08", "TAKIP124", "INDIRIM10")
    )

    // 5. Toplam Ödeme Hesaplama
    // Siparişlerdeki toplam ödeme miktarı hesaplanır ve ekrana yazdırılır.
    println("\nToplam ödeme miktarı hesaplanıyor...")
    var totalPayment = 0.0
    for (order in orders) {
        totalPayment += order.payment
    }
    println("Toplam ödeme miktarı: $totalPayment TL")

    /**************************************************** Araba Uygunluk Değerlendirmesi ********************************************************/


    // Araba bilgileri
    val carName = "Toyota Corolla"
    val carPrice = 15000.0
    val carColor = "Red"
    val carYear = 2022
    val carMileage = 10000
    val carFuelType = "Gasoline"

    // Araba uygunluk değerlendirmesi
    // Arabanın fiyatı, kilometresi ve yakıt türüne göre uygunluğu değerlendirilir.
    if (carPrice > 10000 && carMileage < 15000 && carFuelType == "Gasoline"){
        // Koşullar sağlanıyorsa, araba uygundur
        println("\n$carName araba uygundur")
        println("Fiyatı: $carPrice")
        println("Renk: $carColor")
        println("Yılı: $carYear")
        println("Yakıt Tipi: $carFuelType")
    } else {
        // Koşullar sağlanmıyorsa, araba uygun değildir
        println("\n$carName araba uygun değildir")
    }

    /**************************************************** Kredi Başvuru Değerlendirmesi ********************************************************/


    // Müşteri bilgileri
    val customerName = "Serhat"
    val customerAge = 19
    val customerSalary = 10000
    val customerCreditScore = 700
    val customerCreditLimit = 5000
    val customerCreditStatus = "Good"
    val customerCreditDuration = 12
    val customerCreditAmount = 1000
    val customerCreditInterestRate = 0.05

    // Kredi başvuru değerlendirmesi
    // Müşterinin yaşı, kredi skoru, maaşı ve mevcut kredi durumu değerlendirilir.
    println("\nKredi Başvuru Değerlendirmesi - $customerName")

    if (customerAge < 18) {
        // Müşteri yaşı 18'den küçükse başvuru reddedilir
        println("Kredi başvurusu reddedildi: Yaş sınırı 18'in altında.")
    } else if (customerCreditScore < 600) {
        // Kredi skoru 600'ün altındaysa başvuru reddedilir
        println("Kredi başvurusu reddedildi: Kredi skoru düşük.")
    } else if (customerSalary < 3000) {
        // Müşteri maaşı 3000 TL'den düşükse başvuru reddedilir
        println("Kredi başvurusu reddedildi: Yeterli gelir sağlanamıyor.")
    } else if (customerCreditStatus != "Good") {
        // Kredi durumu "Good" değilse başvuru reddedilir
        println("Kredi başvurusu reddedildi: Mevcut kredi durumu iyi değil.")
    } else if (customerCreditAmount > customerCreditLimit) {
        // İstenen kredi miktarı mevcut limitten büyükse başvuru reddedilir
        println("Kredi başvurusu reddedildi: İstenen kredi miktarı, mevcut kredi limitini aşıyor.")
    } else {
        // Koşullar sağlanıyorsa, kredi onaylanır
        val totalCreditCost = customerCreditAmount * (1 + customerCreditInterestRate * customerCreditDuration / 12)
        println("Kredi başvurusu onaylandı!")
        println("Kredi Tutarı: $customerCreditAmount TL")
        println("Faiz Oranı: ${customerCreditInterestRate * 100}%")
        println("Kredi Vadesi: $customerCreditDuration ay")
        println("Toplam Geri Ödeme Tutarı: $totalCreditCost TL")
        println("Aylık Ödeme: ${totalCreditCost / customerCreditDuration} TL")
    }

    /**************************************************** String İşlemleri ********************************************************/


    val inputString = "  Kotlin ile programlama yapmak çok eğlenceli!   "

    // 1. Stringin başındaki ve sonundaki boşlukları kaldır
    val trimmedString = inputString.trim()
    println("Boşluklar kaldırıldı: '$trimmedString'")

    // 2. Stringi büyük harfe çevir
    val upperCaseString = trimmedString.uppercase()
    println("Büyük harfe çevrildi: '$upperCaseString'")

    // 3. String içindeki bir kelimeyi değiştir (örneğin, 'Kotlin' yerine 'Java')
    val replacedString = trimmedString.replace("Kotlin", "Java")
    println("Kelime değiştirildi: '$replacedString'")

    // 4. Stringin içindeki tüm boşlukları kaldır
    val noSpaceString = trimmedString.replace(" ", "")
    println("Tüm boşluklar kaldırıldı: '$noSpaceString'")

    // 5. Stringin uzunluğunu yazdır
    val stringLength = trimmedString.length
    println("String uzunluğu: $stringLength karakter")

    // 6. Stringin tersini yazdır
    val reversedString = trimmedString.reversed()
    println("Stringin tersi: '$reversedString'")

    /**************************************************** Switch Case (When) ********************************************************/

    // Haftanın gününü belirlemek için when kullandım.
    val dayOfWeek = 3

    when (dayOfWeek) {
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Geçersiz gün")
    }

    /**************************************************** Null Safety ********************************************************/


    val name: String? = null
    println(name?.length ?: "İsim null olduğu için uzunluk hesaplanamadı.")

    /**************************************************** While Döngüsü ********************************************************/

    // While döngüsü örneği
    var counter = 0
    while (counter < 5) {
        println("Sayaç: $counter")
        counter++
    }

    /**************************************************** End ********************************************************/

}
