package oop.task1

fun main()
{
    println("Введите кол-во людей:")
    val n = readln().toIntOrNull() ?: return println("Некорректный ввод.")
    val people = Array(n) { Person() }

    for (i in 0..<n)
    {
        println("Введите имя ${i + 1} человека:")
        val name = readln()
        people[i].setName(name)
    }

    for (person in people)
    {
        person.printName()
    }
}