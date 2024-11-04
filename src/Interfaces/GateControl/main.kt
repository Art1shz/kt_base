package Interfaces.GateControl

fun main()
{
    val gateControl: GateControl = GateControlImpl()

    while (true)
    {
        println("\n=== Управление шлагбаумом ===")
        println("1. Добавить ключ")
        println("2. Удалить ключ")
        println("3. Открыть шлагбаум")
        println("4. Показать активные ключи")
        println("0. Выход")

        when (readlnOrNull())
        {
            "1" ->
            {
                println("Введите код ключа:")
                val key = readlnOrNull() ?: ""
                gateControl.addKey(key)
            }
            "2" ->
            {
                println("Введите код ключа для удаления:")
                val key = readlnOrNull() ?: ""
                gateControl.removeKey(key)
            }
            "3" ->
            {
                println("Введите код ключа для открытия шлагбаума:")
                val key = readlnOrNull() ?: ""
                gateControl.openGate(key)
            }
            "4" -> println("Активные ключи: ${gateControl.getActiveKeys()}")
            "0" ->
            {
                println("Выход из программы.")
                return
            }
            else -> println("Недопустимый выбор.")
        }
    }
}
