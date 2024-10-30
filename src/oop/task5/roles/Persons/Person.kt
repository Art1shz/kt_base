package oop.task5.roles.Persons

open class Person(val name: String, val role: String)
{
    open fun showInfo()
    {
        println("Имя: $name, Роль: $role")
    }
}
