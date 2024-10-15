package kt_base

fun main()
{
    println("Введите первое число:")
    val a = readLine()!!.toDouble()
    println("Введите второе число:")
    val b = readLine()!!.toDouble()
    println("Введите третье число:")
    val c = readLine()!!.toDouble()
    val average = (a + b + c) / 3
    println("Среднее арифметическое: $average")
}
