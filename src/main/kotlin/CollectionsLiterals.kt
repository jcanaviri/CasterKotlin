fun main(args: Array<String>) {
    // This can't change
    var numbers = listOf(1, 2, 3, 4)
    println(numbers)

    // This can change
    numbers = mutableListOf(1, 2, 3, 4)
    println(numbers)

    // The same happens in strings with set
    var strings = setOf("A", "B", "C")
    println(strings)
    strings = mutableSetOf("A", "B", "C")
    println(strings)

    val l = listOf(1, 2, 3, 4)
    println(l.filter { it % 2 == 0 })  // Filter the 2 multiples
    println(l.map { it * 5 }) // all the list is now multiple of 5
    println(l.flatMap { listOf(it, it + 10) })
    println(l.fold(0.0) {acc, i -> acc + i}) // like reduce in other languages

    println("With for each")  // returns Unit
    l.forEach { println(it) }
    println("With on each")  // this returns [1, 2, 3 ,4]
    l.onEach { println(it) }

    // Partitions split into 2 new lists
    val (evens, odds) = l.partition { it % 2 == 0 }
    println("Evens: $evens")
    println("Odds: $odds")
}
