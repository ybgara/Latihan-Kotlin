fun sayHello(name:String) : Unit = println("Hi, $name")
fun sayHy(name:String) : String = name
fun main() {
    println("Single Expression Function")

    sayHello("Garaaaaaaya")
    println("Hi, ${sayHy("Garaaaaaaya")}")
}