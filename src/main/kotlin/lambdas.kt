fun main() {
    var sum = 0
    val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    println(sum)
}
