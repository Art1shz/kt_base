package kt_base

fun main() {
    println("Введите ваш возраст:")
    val age = readLine()?.toIntOrNull()

    if (age == null || age < 0)
    {
        println("Некорректный возраст")
    }
    else
    {
        when
        {
            age in 0..12 -> println("Вы ребёнок")
            age in 13..17 -> println("Вы подросток")
            age in 18..64 -> println("Вы взрослый")
            age >= 65 -> println("Вы пожилой")
            else -> println("Некорректный возраст")
        }
    }
}
