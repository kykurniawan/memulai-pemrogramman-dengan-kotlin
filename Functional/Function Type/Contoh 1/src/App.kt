val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }

val multiply: (Int, Int) -> Int = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(9, 9)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}