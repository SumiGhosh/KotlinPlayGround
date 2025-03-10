package collections

import PrintToConsole

fun main() {
    val set = Set()
    set.immutableSet()
    set.mutableSet()
}

class Set {

    fun immutableSet() {
        val immutableSet = setOf(1, 2, 3, 4, 5)

        PrintToConsole.println(immutableSet)

        // Attempting to modify results in a new set
        val modifiedSet = immutableSet + 6
        PrintToConsole.println(modifiedSet)
    }

    fun mutableSet() {
        // Creating a mutable set
        val mutableSet = mutableSetOf("apple", "banana", "orange")

        // Modifying the set
        mutableSet.add("grape")
        mutableSet.remove("banana")
        PrintToConsole.println(mutableSet)
    }
}