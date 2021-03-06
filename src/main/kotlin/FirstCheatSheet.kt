// "Hello, World" program
fun main(args: Array<String>) {
    println("Hello, World!")

    // For loop
    val list = listOf("A", "B", "C")
    for (element in list) {
        println(element)
    }

    // When expression
    println(numberTypeName(1))
    println(signAsString(0))

    println(sum(2, 4))
    println(sum2(5, 3))

    // Some variables
    val name = "Josue" // Can't be changed
    var age = 5        // Can be changed
    age++
    println("The incremented value is: $age")

    // Variables with nullable types
    val name2: String? = null
    var nameSize: Int = name2?.length ?: 0
    println(nameSize)
    nameSize = name2?.length ?: return
    println(nameSize)
}

// Declaring a function
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Single expression function
fun sum2(a: Int, b: Int) = a + b

// If statement
fun bigger(a: Int, b: Int) = if (a > b) a else b

fun numberTypeName(x: Number) = when(x) {
    0 -> "Zero"
    in 1..4 -> "Four or less"
    5, 6, 7 -> "Five or six or seven"
    is Byte -> "is a byte"
    else -> "Some value"
}

fun signAsString(x: Int) = when {
    x < 0 -> "Negative"
    x == 0 -> "Zero"
    else -> "Positive"
}
