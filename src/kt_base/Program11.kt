package kt_base

fun main() {
    println("Введите число от 1 до 7:")
    val day = readLine()?.toIntOrNull()

    val dayOfWeek = when (day)
    {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный ввод. Пожалуйста, введите число от 1 до 7"
    }
    println(dayOfWeek)
}
