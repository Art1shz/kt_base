package kt_base

fun main() {
    println("Введите число n:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 1)
    {
        for (i in 1..<n)
        {
            println(i * 2)
        }
    }
    else
    {
        println("Некорректный ввод, введите число больше 1")
    }
}
