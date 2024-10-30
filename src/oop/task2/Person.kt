package oop.task2

open class Person
{
    private var name: String = ""

    fun setName(newName: String)
    {
        name = newName
    }

    protected fun getName(): String
    {
        return name
    }
}