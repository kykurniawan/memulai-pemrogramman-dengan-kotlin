fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO 1
    val valC =valueC?:100
    val result = valueA + (valueB - valC)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = result