package com.cloffygames.techcareerbootcamp.tasks


/*************************************** Fahrenheit to Celsius ***************************************/
fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 1.8

}

/*************************************** Dikdörtgen Çevre Hesabı ***************************************/
fun calculateRectanglePerimeter(length: Double, width: Double) {
    val perimeter = 2 * (length + width)
    println("\n\nDikdörtgenin çevresi: $perimeter")
}

/*************************************** Faktöriyel Hesabı ***************************************/
fun calculateFactorial(number: Int): Long {
    return if (number <= 1) {
        1
    } else {
        number * calculateFactorial(number - 1)
    }
}

/*************************************** Kelimenin İçinde Kaç Tane A Olduğunu Bulma ***************************************/
fun countAInWord(word: String) {
    //return text.count { it == character } Buda yapılabilirdi.
    val count = word.count { it == 'A' || it == 'a' }
    println("\n\nKelimedeki A harfi sayısı: $count")
}

/*************************************** İç Açıların Toplamını Bulma ***************************************/
fun calculateInteriorAngleSum(sides: Int): Int {
    return (sides - 2) * 180
}

/*************************************** Maaş Hesabı ***************************************/
/*Kullanıcının bir ay içinde kaç gün çalıştığını parametre olarak alıp çalıştığı günlerde tam gün mesai yaptığı varsayılarak hesaplama yaptım.
  Bir ay içinde 31 günden fazla gün olmadığı için girilebilecek maksimum değer 31 dir.*/
fun calculateSalary(daysWorked: Int): Int {
    if (daysWorked > 31) {
        println("Hata: Çalışılan gün sayısı 31'den büyük olamaz.")
        return 0
    }

    val hoursPerDay = 8
    val regularHourlyWage = 10
    val overtimeHourlyWage = 20
    val regularHoursLimit = 160

    // Toplam çalışma saati
    val totalHoursWorked = daysWorked * hoursPerDay

    // Normal saat ve mesai saatlerinin hesaplanması
    val regularHours = if (totalHoursWorked > regularHoursLimit) regularHoursLimit else totalHoursWorked
    val overtimeHours = if (totalHoursWorked > regularHoursLimit) totalHoursWorked - regularHoursLimit else 0

    // Maaş hesaplama
    val totalSalary = (regularHours * regularHourlyWage) + (overtimeHours * overtimeHourlyWage)

    return totalSalary
}

/************************************** İnternet Kota Hesaplama ***************************************/
fun calculateQuotaCost(usageGB: Int): Int {
    val baseQuota = 50
    val baseCost = 100
    val overageCostPerGB = 4

    return if (usageGB <= baseQuota) {
        baseCost
    } else {
        val overage = usageGB - baseQuota
        baseCost + (overage * overageCostPerGB)
    }
}


/************************************** Genel Sıcaklık Dönüşümü ***************************************/
fun temperatureConverter(value: Double, fromUnit: Int, toUnit: Int): Double {
    return when (fromUnit) {
        1 -> when (toUnit) {
            2 -> (value - 32) * 5 / 9 // Fahrenheit to Celsius
            3 -> (value - 32) * 5 / 9 + 273.15 // Fahrenheit to Kelvin
            else -> value
        }
        2 -> when (toUnit) {
            1 -> (value * 9 / 5) + 32 // Celsius to Fahrenheit
            3 -> value + 273.15 // Celsius to Kelvin
            else -> value
        }
        3 -> when (toUnit) {
            2 -> value - 273.15 // Kelvin to Celsius
            1 -> (value - 273.15) * 9 / 5 + 32 // Kelvin to Fahrenheit
            else -> value
        }
        else -> value
    }
}

/**** Birim İsmi Dönüşümü ****/
fun getUnitName(unit: Int): String {
    return when (unit) {
        1 -> "Fahrenheit"
        2 -> "Celsius"
        3 -> "Kelvin"
        else -> "Bilinmiyor"
    }
}

