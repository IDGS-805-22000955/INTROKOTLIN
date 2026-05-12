fun main(){
    val saludos: String = "Hola"//Inmutable
    var nombre: String ="Kotlin" //Mutable
    println("$saludos $nombre!!!")

    println("Ingresa el primer número")
    val num1 = readln().toInt()

    println("Ingresa el segundo número")
    val num2 = readln().toInt()

    var res =num1 + num2

    println("La suma es : $res")
}