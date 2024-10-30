package oop.task6

import oop.task6.Animals.Animal.Animal
import oop.task6.Animals.*

fun main()
{
    println("Введите название животного (Dog, Cat или Bird):")

    val input = readlnOrNull()
    val animal: Animal = when (input)
    {
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else ->
        {
            println("Неизвестное животное")
            return
        }
    }

    animal.sound()
}
