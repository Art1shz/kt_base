package oop.task2

fun main() {
    println("Введите количество студентов:")
    val n = readln().toInt()
    val students = Array(n) { Student() }

    var i = 0
    while (i < n)
    {
        println("Введите имя и идентификатор студента (через пробел):")
        val input = readln()
        val parts = input.split(" ")

        if (parts.size == 2)
        {
            val name = parts[0]
            val id = parts[1].toIntOrNull()

            if (id != null)
            {
                students[i].setName(name)
                students[i].setStudentId(id)
                i++
            }
            else
            {
                println("Идентификатор студента должен быть целым числом")
            }
        }
        else
        {
            println("Ошибка. введите имя и идентификатор через пробел")
        }
    }

    println("Список студентов:")
    for (student in students)
    {
        student.printStudentDetails()
    }
}