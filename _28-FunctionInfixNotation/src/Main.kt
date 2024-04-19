infix fun String.namaFunction(ubah:String): String{
    if (ubah == "UP") return this.toUpperCase()
    else return this.toLowerCase()
}

fun main() {
    println("Function Infix Notation")

    // ADALAH OPERASI YANG BIASA DILAKUKAN DI OPERASI MATEMATIKA,
    // DIMANA DIA MELAKAUKAN OPERASI TERHADAP DUA DATA
    // HARUS MEMULIKI SATU PARAMETER
    // TIDAK BOLEH VARARGS DAN DEFAULT

    val result = "Tegar Wibisana" namaFunction  "UP"
    println(result)

}