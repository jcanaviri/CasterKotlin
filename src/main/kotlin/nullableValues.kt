fun main() {
    var name: String? = "Josue"
    // name = null

    // if name is null then null
    // if name is not null then the length
    println(name?.length)

    // Elvis Operator ?:
    var lastName: String? = "Canaviri"
    var length: Int = if (lastName != null) lastName.length else 0
    var length2: Int = lastName?.length ?: 0
    println(length2)
}