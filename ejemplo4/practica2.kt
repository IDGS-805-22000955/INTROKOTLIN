/**
 * Problema2: Una batería comienza con 0% de carga. Un cargador añade 15% cada minuto. Se debe detener el ciclo cuando la carga llegue o supere el 100%
 */

fun main() {
    var carga = 0
    var minutos = 0

    println("Iniciando carga. Batería al $carga%")

    while (carga < 100) {
        carga += 15
        if (carga > 100) {
            carga = 100
        }
        minutos++
        println("Minuto $minutos: Carga actual = $carga%")
    }

    println("Ciclo detenido. La batería alcanzó el $carga% en $minutos minutos.")
}
