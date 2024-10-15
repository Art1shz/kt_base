package kt_base

fun main() {
    println("Введите число для поиска:")
    val target = readLine()?.toIntOrNull()

    if (target == null)
    {
        println("Некорректный ввод, введите целое число.")
        return
    }

    println("Введите количество элементов массива:")
    val size = readLine()?.toIntOrNull()

    if (size == null || size <= 0)
    {
        println("Некорректный ввод, ведите положительное целое число для размера массива.")
        return
    }

    val array = IntArray(size)

    println("Введите элементы массива:")
    for (i in 0 until size)
    {
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    val contains = target in array
    println(contains)
}
