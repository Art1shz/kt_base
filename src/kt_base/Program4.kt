package kt_base

fun main() {
    println("Введите символ в нижнем регистре:")
    val input = readLine()

    if (input != null && input.length == 1 && input[0].isLowerCase())
    {
        val lowerChar = input[0]

        val upperChar = lowerChar.uppercaseChar()
        val unicodeCode = upperChar.code

        println("Символ в верхнем регистре: $upperChar")
        println("Код Unicode нового символа: $unicodeCode")
    }
    else
    {
        println("Ошибка, введите один символ в нижнем регистре.")
    }
}
