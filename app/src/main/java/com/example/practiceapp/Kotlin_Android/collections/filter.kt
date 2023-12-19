package com.example.practiceapp.Kotlin_Android.collections

/*The filter() function in Kotlin is used to filter elements from a collection based on a given
 predicate. It returns a new collection containing only elements that meet the given condition.

 collection.filter(predicate: (T) -> Boolean): Collection<T>

 */


fun main() {


    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4]


}

