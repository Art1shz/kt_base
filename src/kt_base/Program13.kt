package kt_base

fun main()
{
    println("Введите время в секундах для обратного отсчета:")
    val input = readLine()?.toIntOrNull()

    if (input != null && input > 0)
    {
        for (i in input downTo 1)
        {
            println(i)
            Thread.sleep(1000)
        }
        println("Старт")
    } else
    {
        println("Ошибка, введите положительное целое число")
    }
}
