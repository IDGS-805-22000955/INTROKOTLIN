import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor:")
    if(v1 >= v2 && v1 >= v3)
        println(v1)
    else if(v2 >= v1 && v2 >= v3)
        println(v2)
    else
        println(v3)
}

fun retornaMayor(v1: Int, v2: Int, v3: Int): Int {
    return if (v1 >= v2 && v1 >= v3)
        v1
    else if (v2 >= v1 && v2 >= v3)
        v2
    else
        v3
}

fun limpiarPantalla(){
    ProcessBuilder("clear").inheritIO().start().waitFor()
}

fun main(){
    limpiarPantalla()
    print("Ingresa el primer valor:")
    val valor1 = readln().toInt()
    print("Ingresa el segundo valor:")
    val valor2 = readln().toInt()
    print("Ingresa el tercer valor:")
    val valor3 = readln().toInt()
    println(String.format("%2f", 3.141698))
    mostrarMayor(valor1, valor2, valor3)
}