fun main() {
    println("When Expression")

    val nilai = "B"

    when(nilai){
        "A", "B", "C" ->{
            println("Amazing")
            println("Anjay")
            println("Lulus")
        }

        "D" ->{
            println("Bagus")
            println("Baik")
        }

        "E" -> println("Cuaksss")

        else ->{
            println("SALAH SALAH SALAH")
        }
    }

    val lulusNIlai = arrayOf("A", "B", "C")

    when(nilai){
        in lulusNIlai ->{
            println("Lulus Coy")
        }

        !in lulusNIlai ->{
            println("Ga Lulus Bang")
        }
    }

    when(nilai){
        is String ->{
            println("Ini String")
        }

        !is String ->{
            println("Bukan String")
        }
    }

    when{
        nilai == "A" ->{
            println("INI A")
        }

        nilai == "B" -> println("INI B")

        else ->{
            println("NIlai Apa INI, hehe")
        }
    }
}