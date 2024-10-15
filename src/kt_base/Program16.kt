package kt_base

fun main() {
    println("Введите длину списка:")
    val size = readLine()?.toIntOrNull() ?: return println("Некорректный ввод.")

    val elements = mutableListOf<String>()

    println("Введите элементы списка (каждый на новой строке):")
    repeat(size)
    {
        val element = readLine() ?: ""
        if (element.isNotEmpty() && element !in elements)
        {
            elements.add(element)
        }
    }

    println("Уникальные элементы в оригинальном порядке: ${elements.joinToString(", ")}")
}
