package kt_base

fun main()
{
    println("Введите количество элементов первого множества:")
    val n = readLine()?.toIntOrNull() ?: return println("Некорректный ввод.")

    val set1 = mutableSetOf<String>()
    println("Введите элементы первого множества (каждый на новой строке):")
    repeat(n)
    {
        set1.add(readLine() ?: "")
    }

    println("Введите количество элементов второго множества:")
    val m = readLine()?.toIntOrNull() ?: return println("Некорректный ввод.")

    val set2 = mutableSetOf<String>()
    println("Введите элементы второго множества (каждый на новой строке):")
    repeat(m)
    {
        set2.add(readLine() ?: "")
    }

    val intersectionSet = set1 intersect set2
    println("Общие элементы: ${intersectionSet.joinToString(", ")}")
}
