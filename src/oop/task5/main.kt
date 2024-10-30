package oop.task5

import oop.task5.roles.*
import oop.task5.roles.Persons.Person

fun main()
{
    println("Введите имя и роль пользователя (Moderator или Admin):")

    try
    {
        val input = readlnOrNull() ?: throw IllegalArgumentException("Ошибка. Пустой ввод.")
        val parts = input.split(" ")

        if (parts.size != 2)
        {
            throw IllegalArgumentException("Ошибка, введите имя и роль через пробел.")
        }

        val name = parts[0]
        val role = parts[1]

        val person: Person = when (role)
        {
            "Moderator" -> Moderator(name)
            "Admin" -> Admin(name)
            else -> throw IllegalArgumentException("Ошибка. Неизвестная роль")
        }

        person.showInfo()
    }
    catch (e: Exception)
    {
        println(e.message)
    }
}
