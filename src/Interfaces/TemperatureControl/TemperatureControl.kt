package Interfaces.TemperatureControl

interface TemperatureControl
{
    var currentTemperature: Double
    var targetTemperature: Double
    var lowerBound: Double
    var upperBound: Double

    fun turnOn()
    fun turnOff()
    fun setTargetTemperature(target: Double): Boolean
    fun setBounds(lower: Double, upper: Double): Boolean
    fun displayStatus(): String
}
