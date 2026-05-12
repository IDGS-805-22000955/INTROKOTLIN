/**
 * Problema1: Un programa solicita al usuario ingresar el diámetro de una tubería
 * No se permiten valores negativos o cero. El programa debe pedir el dato hasta que el usuario ingrese un valor válido.
 */

fun main() {
    var diametro = 0.0

    do {
        print("Ingrese el diámetro de la tubería: ")
        val input = readlnOrNull()
        diametro = input?.toDoubleOrNull() ?: 0.0
        
        if (diametro <= 0) {
            println("Error: El diámetro debe ser un valor mayor a cero.")
        }
    } while (diametro <= 0)

    println("Diámetro ingresado correctamente: $diametro")
}
