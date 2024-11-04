package Interfaces.TemperatureControl

class TemperatureControlImpl : TemperatureControl
{
    override var currentTemperature: Double = 20.0
    override var targetTemperature: Double = 22.0
    override var lowerBound: Double = 18.0
    override var upperBound: Double = 26.0

    override fun turnOn()
    {
        println("Климат-контроль включен")
    }

    override fun turnOff()
    {
        println("Климат-контроль отключен")
    }

    override fun setTargetTemperature(target: Double): Boolean
    {
        targetTemperature = target
        println("Установлена целевая температура: $target")
        return true
    }

    override fun setBounds(lower: Double, upper: Double): Boolean
    {
        lowerBound = lower
        upperBound = upper
        println("Установлены границы температуры: [$lower, $upper]")
        return true
    }

    override fun displayStatus(): String
    {
        return "Текущая температура: $currentTemperature, Целевая температура: $targetTemperature, Границы: [$lowerBound, $upperBound]"
    }
}
