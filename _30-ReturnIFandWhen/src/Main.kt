fun sayHello(name:String = "") : String{
    return if (name == ""){
        "Nama Kosong"
    }else{
        name
    }
}

fun sayHi(name: String = "") : String{
    return when(name){
        "" -> "Nama Kosong"
        else -> name
    }
}

fun main() {
    println("Return IF and WHEN")

    println("Hi, ${sayHello("")}")
    println("Hi, ${sayHello("Garaaaaaaya")}")

    println("Hi, ${sayHi("")}")
    println("Hi, ${sayHi("Garaaaaaaya")}")
}