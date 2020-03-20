// main function
fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
        append("This is my program wwith kotlin")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}