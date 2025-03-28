package collection_functions

import PrintToConsole

fun main() {
    val availableFunctions = AvailableFunctions()
//    availableFunctions.funcForEach()
//    availableFunctions.funcMap()
//    availableFunctions.funcFilter()
//    availableFunctions.funcFlatMap()
//    availableFunctions.funcDistinctBy()
    availableFunctions.funReduce()
}

class AvailableFunctions {

    // Applies an action to each element.
    fun funcForEach() {
        Variables.forEach.forEach { // return type Unit
            PrintToConsole.print("${it*2} ")
        }
    }

    // Transforms each element.
    fun funcMap() {
        val map = Variables.forMap.map { it*it } // Returns list
        PrintToConsole.println(map)
    }

    // Returns an element on satisfying a function
    fun funcFilter() {
        val filter = Variables.forFilter.filter { it%2==0 } // returns a list of elements which
        PrintToConsole.println(filter)                      // satisfies the condition
    }


    // Transforms each element and flattens the results.
    fun funcFlatMap() {
        val flattenedList = Variables.forFlattenMap.flatMap {
            it
        }
        PrintToConsole.println(flattenedList)
    }

    // Returns a list with duplicate elements removed based on a selector function.
    fun funcDistinctBy() {
        val distinctList = Variables.people.distinctBy { it.id }
        PrintToConsole.println(distinctList)
    }

    // Accumulating and reducing

    // Reduce function is used to accumulate a collection into a single value by applying an operation sequentially
    // from left to right.

    //Key Points
    // 1. reduce starts with first element as the initial accumulator
    // 2. If the list is empty, reduce throws an exception(NoSuchElementException)
    // 3. Use reduceOrNull if the collection might be empty to avoid exceptions.
    fun funReduce() {
        //Syntax: list.reduce { accumulator, element -> operation }
        val value = Variables.forReduce.reduce { acc, i -> acc + i  }
        PrintToConsole.println(value)

        //Other examples:
        //1.Finding the highest value
        val highestValue = Variables.forReduce.reduce { acc, i -> if(i > acc) i else acc }
        PrintToConsole.println(highestValue)
    }

    //Fold Function is used to reduce a collection to a single value, with an initializer to start
    //Key Points:
    // If you need an initial value to pass with the list
    // Since using an initial value to start with, even though the list is empty, it won't throw the error
    fun funFold() {
        val value = Variables.forReduce.fold(initial = 10) { acc, ele -> acc+ ele }
        PrintToConsole.println(value)
        //Output will be 10+1+2+3+4 = 20

        // Egs:
        // 1. Concatenation of the String
        val strings = listOf("Kotlin","is","awesome")
        val sentence = strings.fold(initial = "Sentence is:") {acc, ele -> "$acc $ele"}
        PrintToConsole.println(sentence)

        // 2.Factorial using Fold
        val numbers = (1..5).toList()
        val factorial = numbers.fold(1) {acc, i -> i*acc  }
        PrintToConsole.println(factorial)
    }
}

object Variables {
    val forEach = listOf(1,2,3,4,5)
    val forMap = listOf(1,2,3,4,5)
    val forFilter = listOf(1,2,3,4,5)
    val forFlattenMap = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val people = listOf(Person(1, "Alice"), Person(2, "Bob"), Person(1, "Charlie"))
    val forReduce = listOf(1,2,3,4)
}

data class Person(val id: Int, val name: String)
