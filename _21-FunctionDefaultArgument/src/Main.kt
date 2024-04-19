fun sayHello( first: String ,second: String = " :) "){
    println("Hi, $first $second")
}
fun sayHi( first: String ,second: String? = null ){
    if (second == null){
        println("Hi, $first")
    }else
        println("Hi, $first $second")
}
fun main() {
    println("Function Default Argumen")

    sayHello("Tegar", "Wibisana")
    sayHello("Gara")

    sayHi("Tegar", "Wibisana")
    sayHi("Gara")
}