import kotlin.math.PI
import kotlin.math.pow

fun areaCuadrado() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readln().toDoubleOrNull() ?: 0.0
    val area = lado * lado
    println("El área del cuadrado es: $area")
}

fun areaTriangulo() {
    print("Ingrese la base del triángulo: ")
    val base = readln().toDoubleOrNull() ?: 0.0
    print("Ingrese la altura del triángulo: ")
    val altura = readln().toDoubleOrNull() ?: 0.0
    val area = (base * altura) / 2.0
    println("El área del triángulo es: $area")
}

fun areaCirculo() {
    print("Ingrese el radio del círculo: ")
    val radio = readln().toDoubleOrNull() ?: 0.0
    val area = PI * radio.pow(2)
    println("El área del círculo es: $area")
}

fun areaRectangulo() {
    print("Ingrese la base del rectángulo: ")
    val base = readln().toDoubleOrNull() ?: 0.0
    print("Ingrese la altura del rectángulo: ")
    val altura = readln().toDoubleOrNull() ?: 0.0
    val area = base * altura
    println("El área del rectángulo es: $area")
}

fun main() {
    var opcion: Int

    do {
        println("\n--- Cálculo de Áreas ---")
        println("1. Cuadrado")
        println("2. Triángulo")
        println("3. Círculo")
        println("4. Rectángulo")
        println("5. Salir")
        print("Elige una opción: ")
        
        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> areaCuadrado()
            2 -> areaTriangulo()
            3 -> areaCirculo()
            4 -> areaRectangulo()
            5 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Intente de nuevo.")
        }
    } while (opcion != 5)
}
