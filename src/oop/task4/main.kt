package oop.task4

fun main() {
    println("Введите команду(play):")
    val command = readlnOrNull()

    if (command == "play")
    {
        val guitar = Guitar()
        guitar.play()
    }
    else
    {
        println("Неизвестная команда.")
    }
}