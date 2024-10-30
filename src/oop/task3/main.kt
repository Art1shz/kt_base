package oop.task3

fun main() {
    println("Введите тип данных (Int или Double):")
    val dataType = readln()

    println("Введите Тип операции (\"add\", \"subtract\", \"multiply\", \"divide\"):")
    val operation = readln()

    println("Введите первое число:")
    val firstNumber = readln()

    println("Введите второе число:")
    val secondNumber = readln()

    val mathOps = MathOperations()
    val result: Double

    try
    {
        when (dataType)
        {
            "Int" ->
                {
                val num1 = firstNumber.toInt()
                val num2 = secondNumber.toInt()
                result = when (operation)
                {
                    "add" -> mathOps.add(num1, num2)
                    "subtract" -> mathOps.subtract(num1, num2)
                    "multiply" -> mathOps.multiply(num1, num2)
                    "divide" -> mathOps.divide(num1, num2)
                    else -> throw IllegalArgumentException("Неизвестная операция")
                }
            }

            "Double" ->
                {
                val num1 = firstNumber.toDouble()
                val num2 = secondNumber.toDouble()
                result = when (operation)
                {
                    "add" -> mathOps.add(num1, num2)
                    "subtract" -> mathOps.subtract(num1, num2)
                    "multiply" -> mathOps.multiply(num1, num2)
                    "divide" -> mathOps.divide(num1, num2)
                    else -> throw IllegalArgumentException("Неизвестная операция")
                }
            }
            else -> throw IllegalArgumentException("Неизвестный тип данных")
        }
        println("Результат: $result")
    }
    catch (e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}
