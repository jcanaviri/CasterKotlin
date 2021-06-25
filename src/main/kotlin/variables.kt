fun main() {
    // The keyword var give us the
    // ability to change the value store in there
    var name = "Josue"
    name = "Josue Miguel"
    println(name.isEmpty()) // False

    // val cannot change
    val lastName = "Canaviri Martinez"
    println(lastName)

    // We can set explicitly the type of variable
    val fullName = "Josue Miguel Canaviri Martinez"
    println(fullName::class)
}
