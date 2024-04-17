const val APP = "aplikasi"
const val VERSION = "1.0"
fun main() {
    println("Variable")

    // MUTABLE  = Bisa Diubah       == VAR
    // IMUTABLE = Tidak Bisa Diubah == VAL

    var satu: String = "Tegar"
    var dua = "Wibisana"
    val hoby = "Music"

    var nama = "$satu $dua"
    println(nama + " " + hoby)

    var tiga: String? = "gara"
    tiga = null
    println(tiga)
    println(tiga?.length)

    tiga = "Gara"
    println(tiga?.length)

    var application = "$APP $VERSION"
    println(application)f
}