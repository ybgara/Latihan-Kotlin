fun fullName(first:String,middle:String, last:String){
    println("Nama   : $first $middle $last ")
}
fun main() {
    println("Function Named Argument")

    fullName("Tegar", "\"Garaaaaaaya\"", "Wibisana")
    fullName(
        last = "Wibisana",
        middle = "\"Garaaaaaaya\"",
        first = "Tegar")
}