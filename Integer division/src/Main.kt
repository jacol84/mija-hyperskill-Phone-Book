fun intDivision(x: String, y: String): Int = try {
    x.toInt().div(y.toInt())
} catch (e: Exception) {
    val message = if (e is ArithmeticException) "Exception: division by zero!" else "Read values are not integers."
    println(message)
    0
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}