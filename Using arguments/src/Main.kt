//fun main(args: Array<String>) = println("Hello, ${args.getOrElse(0) { "Name" }}!")

//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max.html

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(IntArray(scanner.nextInt()) { scanner.nextInt() }.filter { it % 4 == 0 }.max())
}