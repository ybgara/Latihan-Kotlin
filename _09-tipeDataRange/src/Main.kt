fun main() {
    println("Tipe Data Range")

    val numbers: Array<IntRange> = arrayOf(1..100)
    val Numbers: IntRange = 1..100

    println(Numbers.count())
    println(Numbers.contains(1000))
    println(Numbers.first)
    println(Numbers.last)
    println(Numbers.step)

    val NUmbers = 100 downTo 1

    println(NUmbers.count())
    println(NUmbers.contains(1000))
    println(NUmbers.first)
    println(NUmbers.last)
    println(NUmbers.step)

    val NUMbers: IntProgression = 1..100 step 2

    println(NUMbers.count())
    println(NUMbers.contains(1000))
    println(NUMbers.first)
    println(NUMbers.last)
    println(NUMbers.step)


}