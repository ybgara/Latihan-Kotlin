fun main() {
    println("Break And Continue")

    // BREAK = KElUAR PERULANGAN
    // CONTINUE = SKIP PERULANGAN

    var i = 0
    while (true){
        i++

        when{
            i >= 50 -> break
            i >= 11 && i <= 20 -> continue
            i % 2 == 0 -> continue
        }

        print(" $i")
    }
}