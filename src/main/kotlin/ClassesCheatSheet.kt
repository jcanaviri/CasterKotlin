class Person2(val name: String, var age: Int)
// name is read only, age is mutable

// Inheritance
open class BaseClass(val name: String) {
    open fun hello() = "Hello, $name"
}
class ChildClass(name: String): BaseClass(name) {
    override fun hello() = "Hello $name, from a child class"
}

// Properties with assessors
class Person3(var name: String, var surname: String) {
    var fullName: String
        get() = "$name $surname"
        set(value) {
            val (first, second) = value.split(" ", limit=2)
            name = first
            surname = second
        }
}

// Data clases
data class Person4(val name: String, var age: Int)

fun main(args: Array<String>) {
    val me = Person2("Josue", 89)
    println(me.name)
    // me.name = "Miguel"
    // this throws an error
    println(me.age)
    me.age = 39
    println(me.age)

    // Use the inheritance
    val other = BaseClass("John")
    val you = ChildClass("Susan")

    println(other.hello())
    println(you.hello())

    val dave = Person3("Josue", "Canaviri")
    println(dave.fullName)
    dave.fullName = "Miguel Martinez"
    println(dave.fullName)

    // Use of dataclasses
    val mike = Person4("Mike", 23)
    println(mike)  // This have toString override by default
    println(mike == Person4("Mike", 23)) // also the equals method
    println(mike == Person4("Mike", 22))

    println(mike.hashCode())

    // Destructuring
    val (name, age) = mike
    println("Your name and age is: $name $age")
}
