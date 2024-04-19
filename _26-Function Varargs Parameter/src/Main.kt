fun varargsFunction(vararg number:Int) : Int{
    var total = 0

    for (value in number){
        total += value
    }

    return total
}

fun main() {
    println("Function Varargs Parameter")

    // Varargs == VARIABLE ARGUMENT
    // DATANYA BISA MENERIMA SATU INPUT BISA DIANGGAP SEMACAM ARRAY
    // RIBET JIKA MENGGUNAKAN ARRAY SEBAGAI PARAMETER
    // HARUS MENJADI PARAMETER TERAKHIR

    println("Penjumlahan Beruturan 1 - 10 = ${varargsFunction(1,2,3,4,5,6,7,8,9,10)}")
}