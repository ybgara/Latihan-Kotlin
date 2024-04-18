fun main() {
    println("Operasi Boolean")

    // &&   DAN
    // ||   ATAU
    // !    KEBALIKAN

    val nilai = 78
    val absen = 70

    val lulusNIlai:Boolean = nilai > 70
    val lulusAbsen = absen >= 70

    val lulus = lulusNIlai && lulusAbsen

    println(lulus)

}