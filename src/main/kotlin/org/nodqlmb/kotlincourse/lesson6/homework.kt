package org.nodqlmb.kotlincourse.lesson6

fun main () {
    println(Seasons(month))
    println(PetToHumanAge(PetAge))
    println(VehicleofChoice(distance))
    println(calculateBonus(purchaseamount))
    println(fileType(fileExtension))
    println(Clothes(OutdoorTemperature))
    println(AgeLimitation(age))
    println(TempConversion(temperature, scale))
    println(TempConversion(20.0, "C"))

}
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
    val month = 8
    fun Seasons(month: Int): String {
        return if (month in 1..2 || month == 12) {
            "Winter"
        } else if (month in 3..5) {
            "Spring"
        } else if (month in 6..8) {
            "Summer"
        } else
            if (month in 9..11) {
                "Autumn"
            } else
                "Invalid month"
    }
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
        val PetAge: Int = 4

        fun PetToHumanAge(PetAge: Int): Any {
            return if (PetAge <= 2) {
                PetAge * 10.5
            } else (PetAge - 2) * 4 + 21
        }

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

    val distance: Int = 10

    fun VehicleofChoice(distance: Int) : String {
        return if (distance < 1)  {
            "Walk"
        } else if (distance in 1..4) {
            "Ride a bike"
        } else {
            "Drive a car"
        }
    }

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
//2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

val purchaseamount: Int = 1666 //

fun calculateBonus(purchaseamount: Int) : Int {
    return when  {
        purchaseamount < 1000 -> purchaseamount / 100 * 2
        purchaseamount >= 1000 -> purchaseamount / 100 * 5
        else -> 0
    }
}


//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию,
//которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение",
//"Таблица" или "Неизвестный тип".

val fileExtension: String = ".xls"
fun fileType(fileExtension: String): String {
        return when (fileExtension) {
            in "txt", "doc", "docx" -> "Текстовый документ"
            in "jpg", "png" -> "Изображение"
            in "xls", "xlsx" -> "Таблица"
            else -> "Неизвестный тип"
        }
    }

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
//в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
//Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шаблон “$result F” для фаренгейта
//или “$result C” для цельсия

var temperature: Double = 77.0
val scale: String = "F"
fun TempConversion(temperature: Double, scale: String): String {
    return if (scale == "C") {
        val result = temperature * 9 / 5 + 32
        "$result F"
    } else if (scale == "F") {
        val result = (temperature - 32) * 5 / 9
        "$result C"
    } else {
        "Invalid scale"
    }
}

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при
//температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

    val OutdoorTemperature: Int = 8

    fun Clothes(OutdoorTemperature: Int) : String {
        return if (OutdoorTemperature in -30..0) {
            "куртка и шапка"
        } else if (OutdoorTemperature in 0..14)  {
            "ветровка"
        } else if (OutdoorTemperature in 15..35)  {
            "футболка и шорты"
        } else {
            "сидим дома"
        }
    }

//Задание 8: "Выбор Фильма по Возрасту"
// Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские",
// "подростковые", "18+".

val age: Int = 8
    fun AgeLimitation(age: Int): String {
        return when(age) {
            in 0..10 -> "детские"
            in 11..17 -> "детские, подростковые"
            else -> "детские, подростковые, 18+"
        }
    }
