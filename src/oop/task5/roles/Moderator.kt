package oop.task5.roles

import oop.task5.roles.Persons.Person

class Moderator(name: String) : Person(name, "Moderator")
{
    override fun showInfo()
    {
        println("Модератор: $name")
    }
}
