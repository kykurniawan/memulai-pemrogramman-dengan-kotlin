// main function
fun main() {
    val colorGreen: Color = Color.GREEN
    val colorRed: Color = Color.RED

    print("Position GREEN is ${colorGreen.ordinal}")
    print("Position RED is ${colorRed.ordinal}")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}