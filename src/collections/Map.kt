package collections

import PrintToConsole

fun main() {
    val map = Map()
    map.immutableMap()
    map.mutableMap()
}

class Map {

    fun immutableMap() {
        val immutableMap = mapOf("android" to 1,"iOS" to 2,"web" to 3)
        PrintToConsole.println(immutableMap)

        val valueAndroid = immutableMap["android"]
        PrintToConsole.println(valueAndroid!!)

        val modifiedMap = immutableMap + ("cloud" to 4)
        PrintToConsole.println(modifiedMap)
    }

    fun mutableMap() {
        val mutableMap = mutableMapOf("android" to 1, "iOS" to 2, "web" to 3)
        PrintToConsole.println(mutableMap)

        mutableMap.remove("web")
        PrintToConsole.println(mutableMap)

        mutableMap.putIfAbsent("web",3)
        PrintToConsole.println(mutableMap)


    }
}