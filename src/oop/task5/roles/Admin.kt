package oop.task5.roles

import oop.task5.roles.Persons.Person

class Admin(name: String) : Person(name, "Admin")
{
    override fun showInfo()
    {
        println("Администратор: $name")
    }
}
