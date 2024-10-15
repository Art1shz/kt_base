package kt_base

fun main() {
    println("Введите строку (или оставьте пустым):")
    val input = readLine()

    println("Длина введённой строки: ${input?.length ?: "Строка равна null."}")
}
