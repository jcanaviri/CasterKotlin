fun main(args: Array<String>) {
    // var can change
    var name = "Josue"
    name = "Josue Miguel"
    println(name.isEmpty()) // False

    // val cannot change
    val lastName = "Canaviri Martinez"
    println(lastName)

    // We can set explicitly the type of variable
    val fullName: String = "Josue Miguel Canaviri Martinez"
    println(fullName::class)
}
