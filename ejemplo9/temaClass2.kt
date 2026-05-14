class Persona constructor(nombre: String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if (edad >= 18)
            println("$nombre es mayor de edad")
    }
}

fun main(){
    val persona1: Persona
    persona1 = Persona("Juan", 12)
    persona1.esMayorEdad()
}