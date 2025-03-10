package collections

import PrintToConsole

fun main() {
    val list = List()
    list.immutableList()
    list.mutableList()

}

class List {

    // Immutable collections, once created, cannot be modified. Any operation that would
    // change the collection results in a new collection being created.
    fun immutableList() {
        val immutableList = listOf("java","kotlin")
        PrintToConsole.println(immutableList)

        val newList = immutableList + "python"
        PrintToConsole.println(newList)
    }
    // Mutable collections allow you to modify, add, or remove elements after the collection
    // has been created.
    fun mutableList() {
        val mutableList = mutableListOf("android","iOS")
        PrintToConsole.println(mutableList)

        mutableList.add("web")
        mutableList.addFirst("addFirst")
        mutableList.addLast("addLast")
        PrintToConsole.println(mutableList)
    }
}