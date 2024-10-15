package kt_base

fun main() {
    var combinedString = ""

    repeat(5)
    {
        println("Введите строку:")
        val input = readLine() ?: ""
        combinedString += input + " "
    }

    println("Объединённые строки: $combinedString")
}
