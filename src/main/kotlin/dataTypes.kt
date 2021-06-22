fun main() {
    // Number and Integer types
    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    var myLong: Long = 64 // 64-bit signed integer

    // Decimal types
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 2.54 // 64-bit floating point number

    println(myByte.toDouble()) // This converts a byte number into a double number
    println(myByte.toDouble()::class.java)

    println(myInt.toLong())
    println(myInt.toLong()::class.java)

    // This is valid and its purpose is
    // just for a better reading
    val bigLong: Long = 1_000_000
    println(bigLong)

    val newInt: Int = myInt + 12
    println("The value added 12 is: $newInt")
}
