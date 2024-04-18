fun main() {
    println("For Loops")

    val names:Array<String> = arrayOf("Tegar", "Gara", "Garaaaaaaya", "Wibisana")
    val numbers = 1.. 10

    var loop = 0 ;
    for (name in names){
        println(name)
        loop++
    }

    println("Perulangan = $loop")


    for (number in numbers){
        print(" $number")
    }
    println()

    for (i in 1..10 step 2){
        print(" $i")
    }
    println()

    for (i in 100 downTo 1 step 3){
        print(" $i")
    }
    println()

    val index = names.size - 1
    for (i in 0..index){
        println("Index Ke-$i = ${names.get(i)}")
    }
}