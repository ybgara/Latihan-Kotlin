fun main() {
    println("Tipe Data Number")

    var age: Int = 100
    var phi: Double = 3.14
    var hexa: Int = 0xFF
    var binary: Int = 0b1010101010

    println(age)
    println(phi)
    println(hexa)
    println(binary)

    var price: Long = 100_000_000_000L
    println(price)

    var number: Int = 100

    println(number.toFloat())
    println(number.toByte())
    println(number.toString())
    println(price.toInt())
    println(binary.toInt())
}