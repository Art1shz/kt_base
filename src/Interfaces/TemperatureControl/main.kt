package Interfaces.TemperatureControl

fun main()
{
    val temperatureControl: TemperatureControl = TemperatureControlImpl()

    while (true)
    {
        println("\n=== Управление температурой ===")
        println("1. Показать статус")
        println("2. Установить целевую температуру")
        println("3. Установить границы температуры")
        println("4. Включить климат-контроль")
        println("5. Выключить климат-контроль")
        println("0. Выход")

        when (readlnOrNull())
        {
            "1" -> println(temperatureControl.displayStatus())
            "2" ->
            {
                println("Введите целевую температуру:")
                val target = readlnOrNull()?.toDoubleOrNull() ?: continue
                temperatureControl.setTargetTemperature(target)
            }
            "3" ->
            {
                println("Введите нижнюю границу:")
                val lower = readlnOrNull()?.toDoubleOrNull() ?: continue
                println("Введите верхнюю границу:")
                val upper = readlnOrNull()?.toDoubleOrNull() ?: continue
                temperatureControl.setBounds(lower, upper)
            }
            "4" -> temperatureControl.turnOn()
            "5" -> temperatureControl.turnOff()
            "0" ->
            {
                println("Выход из программы")
                return
            }
            else -> println("Недопустимый выбор")
        }
    }
}
