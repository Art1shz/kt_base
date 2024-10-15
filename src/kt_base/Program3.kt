package kt_base

fun main()
{
    println("Введите первый символ:")
    val a = readLine()?.get(0)
    println("Введите второй символ:")
    val b = readLine()?.get(0)

    if (a != null && b != null)
    {
        val unicodeFirst = a.code
        val unicodeSecond = b.code
        val difference = unicodeFirst - unicodeSecond
        println("Разность Unicode: $difference")
    }
    else
    {
        println("Ошибка, оба символа должны быть введены")
    }
}
