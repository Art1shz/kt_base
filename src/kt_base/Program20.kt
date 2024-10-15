package kt_base

fun main() {
    println("Введите элементы списка через запятую:")
    val input = readLine()?.split(",")?.map { it.trim() } ?: return println("Некорректный ввод.")

    val frequencyMap = input.groupingBy { it }.eachCount()

    for ((element, count) in frequencyMap) {
        println("$element: $count")
    }
}
