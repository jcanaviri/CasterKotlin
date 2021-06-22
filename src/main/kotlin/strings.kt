fun main() {
    var fullName: String = "Josue Canaviri"
    println(fullName.length)
    println(fullName.decapitalize()) // removes the first upper letter
    val c: Char = 'x' // Single quotes is for characters
    val message: String = """This is a message
    with more lines""".trimMargin(">>>")
    println(message)

    // String interpolation
    val name = "Josue"
    val lastName = "Canaviri"
    println("$name $lastName how is it going?")
}
