fun main() {
    println("Tipe Data Array")

    val names: Array<String> = arrayOf("Tegar", "Gara", "Wibisana")

    println(names.size)
    println(names.get(2))
    println(names[2])

    names.set(1, "Garaaaaaaya")

    // Kenapa bisa mengubah ? Karena mengubah isi data array
    // Bukan membuat array baru lagi

//    val satu:Int = 1
//    val dua:Int = 2
//
//    satu = 11 ;

    println(names.size)
    println(names.get(1))
    println(names[1])

    val Members: Array<String?> = arrayOfNulls(5)
    Members.set(0, "T")
    Members.set(1, null)
    Members.set(2, "G")
    Members.set(3, null)
    Members.set(4, "R")

    print(Members[1])
}