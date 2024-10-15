package kt_base

fun main() {
    println("Введите длину массива:")
    val originalSize = readLine()?.toIntOrNull() ?: return println("Некорректный ввод.")

    val originalArray = IntArray(originalSize)

    println("Введите элементы массива:")
    for (i in originalArray.indices)
    {
        originalArray[i] = readLine()?.toIntOrNull() ?: 0
    }

    val reversedArray = IntArray(originalSize)
    for (i in originalArray.indices)
    {
        reversedArray[i] = originalArray[originalSize - 1 - i]
    }

    println("Новый массив в обратном порядке: ${reversedArray.joinToString(", ")}")
}
