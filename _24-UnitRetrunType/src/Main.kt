fun returnFunction(a: Int, b: Int): Int{

    val total = a + b

    // RETURN BISA DI DALAM IF ELSE
    // RETURN BISA TERDAPAT DUA / LEBIH
    return total
}

fun main() {
    println("Function Return Type")

    // KALAU PADA VOID MENGGUNAKAN UNIT
    // JIKA FUNCTIOON YANG MENGEMBALIKAN NILAI MENGGUNAKAN TIPE DATA ITU SENDIRI
    // : TIPE DATA

    val a = 24
    val b = 115
    println("Hasil Pertambahan $a + $b = ${returnFunction(a,b)}")
}