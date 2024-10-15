package kt_base
fun main()
{
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null)
    {
        println("Ошибка: введено не число")
    }
    else
    {
        val result = if (number % 2 == 0) "четное" else "нечетное"
        println("$number является $result числом")
    }
}
