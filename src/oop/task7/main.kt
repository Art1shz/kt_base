package oop.task7

fun main() {
    println("Введите количество автомобилей:")

    val n = readln().toIntOrNull() ?: run {
        println("Ошибка: Введите корректное число")
        return
    }

    if (n <= 0) {
        println("Ошибка: Количество автомобилей должно быть больше нуля")
        return
    }

    val cars = Array<Car>(n) { Car("", 0) }

    for (i in 0..<n)
    {
        println("Введите марку и год выпуска автомобиля:")
        val input = readlnOrNull() ?: return

        val parts = input.split(" ")
        if (parts.size != 2)
        {
            println("Ошибка: Введите марку и год через пробел")
            return
        }

        val brand = parts[0]
        val year = parts[1].toIntOrNull() ?:
        run{
            println("Ошибка: Год выпуска должен быть числом")
            return
        }
        cars[i] = Car(brand, year)
    }

    println("\nСписок автомобилей:")
    for (car in cars)
    {
        car.printDetails()
    }
}
