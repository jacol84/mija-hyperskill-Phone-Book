fun solution(numbers: List<Int>) = numbers.filter { it % 2 == 0 }.joinToString(" ").also { println(it) }
