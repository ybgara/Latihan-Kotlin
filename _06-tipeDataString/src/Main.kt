fun main() {
    println("Tipe Data String")

    var satu: String = "Tegar"
    var dua: String = "Wibisana"

    println(satu)
    println(dua)

    var nama: String = """
        ini adalah nama saya,
        Tegar Wibisana, 
        umur 21 Tahun, 
        dan Ganteng
    """.trimIndent()

    println(nama)

    var kalimatSatu: String = """
        | Tegar Wibisana,
        | Garaaaaaaya,
        | YB
    """.trimMargin()

    println(kalimatSatu)

    var kalimatDua: String = """
        > Tegar Wibisana,
        > Garaaaaaaya,
        > YB
    """.trimMargin(">")

    println(kalimatDua)

    var fullName: String = "$satu $dua"
    println(fullName)
    println("Nama Saya Adalah $fullName, dan Panjang Karakternya Adalah ${fullName.length}")
}