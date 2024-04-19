fun String.hello(): String{

    return "Hello $this"
}

fun String.hi(): Unit = println("Hi, $this")

fun main() {
    println("Extention Function")

    // MENAMBAHKAN FUNCITON PADA TIPE DATA YANG SUDAH ADA
    // DISARANKAN JIKA TIDAK BUTUH TIDAK DIGUNAKAN

    val name = "Gara"

    println(name.hello())
    name.hi()
}