fun main() {
    fun part1(input: List<Int>): Int {
        return (0 until input.lastIndex).count{ input[it] < input[it + 1] }
    }

    fun part2(input: List<Int>): Int {
        val windows = input.windowed(3) { it.sum() }
        return part1(windows)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test").map { it.toInt() }
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
