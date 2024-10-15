package kt_base

fun main() {
    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()

    println("Введите количество элементов первого множества:")
    repeat(readLine()?.toIntOrNull() ?: return println("Некорректный ввод."))
    {
        set1.add(readLine() ?: "")
    }

    println("Введите количество элементов второго множества:")
    repeat(readLine()?.toIntOrNull() ?: return println("Некорректный ввод."))
    {
        set2.add(readLine() ?: "")
    }

    val unionSet = set1 + set2
    println("Объединение множеств: ${unionSet.joinToString(", ")}")
}
