// main function
fun main() {
    val value: Int? = 8

    println(value.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0