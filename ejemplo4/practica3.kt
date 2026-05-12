/**
 * Problema3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos
 * una clave de seguridad
 */
fun main() {
    val claveCorrecta = "DiegoEsPuto"
    var intentos = 3
    var accesoConcedido = false

    println("--- Sistema de Seguridad PLC ---")

    while (intentos > 0) {
        print("Ingrese la clave de seguridad (Intentos restantes: $intentos): ")
        val claveIngresada = readlnOrNull()

        if (claveIngresada == claveCorrecta) {
            accesoConcedido = true
            break
        } else {
            intentos--
            if (intentos > 0) {
                println("Clave incorrecta. Intente de nuevo.\n")
            }
        }
    }

    if (accesoConcedido) {
        println("Acceso concedido.")
    } else {
        println("Sistema bloqueado: Ha superado el número máximo de intentos fallidos.")
    }
}
