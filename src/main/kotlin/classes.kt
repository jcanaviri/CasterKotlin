class MyClass {
    // Companion object is a singleton inside a class
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    val instance = MyClass.create()

    // Add the swap method to a mutable list
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }
}
