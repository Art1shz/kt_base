package oop.task3

class MathOperations {

    fun add(a: Int, b: Int): Double = (a + b).toDouble()
    fun subtract(a: Int, b: Int): Double = (a - b).toDouble()
    fun multiply(a: Int, b: Int): Double = (a * b).toDouble()
    fun divide(a: Int, b: Int): Double
    {
        if (b == 0)
        {
            throw IllegalArgumentException("Деление на ноль невозможно")
        }
        return a.toDouble() / b
    }

    fun add(a: Double, b: Double): Double = a + b
    fun subtract(a: Double, b: Double): Double = a - b
    fun multiply(a: Double, b: Double): Double = a * b
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0)
        {
            throw IllegalArgumentException("Деление на ноль невозможно")
        }
        return a / b
    }
}