package Interfaces.GateControl

interface GateControl
{
    fun openGate(key: String): Boolean
    fun addKey(key: String): Boolean
    fun removeKey(key: String): Boolean
    fun getActiveKeys(): List<String>
}
