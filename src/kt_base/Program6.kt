package kt_base
fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    if (input.length < 2)
    {
        println("Ошибка: строка должна содержать как минимум 2 символа.")
        return
    }

    val firstTwoChars = input.take(2)
    val remainingString = input.drop(2)

    val result = remainingString + firstTwoChars

    println("Результат: $result")
}
