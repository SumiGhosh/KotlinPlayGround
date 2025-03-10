package collections

import PrintToConsole


fun main() {
    val array = Array()
    array.immutableArray()
    array.mutableArray()
}


// An Array in Kotlin is a fixed-size collection of elements of the same
// type. Elements are accessed by their index, starting from zero.
class Array {

    fun immutableArray() {
        val immutableArray = arrayOf(10,20,30)
        PrintToConsole.println(immutableArray[0])
        val newArray = immutableArray + 40
        PrintToConsole.println(newArray.size)
    }

    fun mutableArray() {
        //for dynamic list of array
        val mutableArray = arrayListOf(10,20,30)
        PrintToConsole.println(mutableArray[0])

        mutableArray.add(40)
        PrintToConsole.println(mutableArray)
    }
}