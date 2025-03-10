package collections

import PrintToConsole

fun main() {
    val sequence = Sequence()
    sequence.create()
}


// A Sequence in Kotlin is a lazily evaluated collection of elements. It allows for
// more efficient processing of large datasets by computing elements on-demand.
class Sequence {

    // Sequence don't store the elements, they only know how to generate them.
    // Lazy Evaluation - Operations on sequences not performed instantly, until a terminal operation is called like
    // toList(), count(), filter(),etc...
    // A terminal operation is needed to trigger the actual computation of the sequence. It consumes the sequence and produce
    // a result
    fun create() {
        // Creating sequence
        val sequence = sequenceOf(1, 2, 3, 4, 5)
        PrintToConsole.println(sequence.toList())

        // Transforming elements using map
        val squaredSequence = sequence.map { it * it }

        // Accessing elements after transformation
        PrintToConsole.println(squaredSequence.toList())
    }
}