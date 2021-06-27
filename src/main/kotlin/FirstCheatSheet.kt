// "Hello, World" program
fun main(args: Array<String>) {
    println("Hello, World!")

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
