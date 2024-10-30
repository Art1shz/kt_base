package oop.task2

class Student : Person()
{
    private var studentId: Int = 0

    fun setStudentId(newId: Int)
    {
        studentId = newId
    }

    fun printStudentDetails()
    {
        println("Name: ${getName()}, Student ID: $studentId")
    }
}