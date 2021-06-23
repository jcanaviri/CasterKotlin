// In Kotlin functions are first class citizens
fun printName(name: String) {
    println("Hello, $name!")
}

fun main() {
    printName("Josue")

    val sum = { x: Int, y: Int -> x + y}
    val sum2: (Int, Int) -> Int = { x, y -> x + y}
    println(sum2(2, 2))
}
