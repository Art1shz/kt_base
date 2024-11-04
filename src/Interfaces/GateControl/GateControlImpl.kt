package Interfaces.GateControl

class GateControlImpl : GateControl
{
    private val keys = mutableSetOf<String>()

    override fun openGate(key: String): Boolean
    {
        return if (keys.contains(key))
        {
            println("Шлагбаум открыт")
            true
        }
        else
        {
            println("Недействительный ключ")
            false
        }
    }

    override fun addKey(key: String): Boolean
    {
        return keys.add(key).also {
            if (it) println("Ключ добавлен: $key") else println("Ключ уже существует: $key")
        }
    }

    override fun removeKey(key: String): Boolean
    {
        return keys.remove(key).also {
            if (it) println("Ключ удален: $key") else println("Ключ не найден: $key")
        }
    }

    override fun getActiveKeys(): List<String>
    {
        return keys.toList()
    }
}
