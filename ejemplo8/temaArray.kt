fun main() {
    //Números
    val numeros = arrayOf(1, 2, 3, 4, 5)

    println(numeros[0])

    //Cadenas
    val nombres = arrayOf("Ana", "luis", "Carlos")
    println(nombres[1])

    //Recorrer arreglos
    val frutas = arrayOf("Manzana", "Perea", "Uva")
    for(fruta in frutas){
        println(fruta)
    }

    //Arreglo vacío
    val numerosVacios = Array(5){0}

    //Matriz
    val matriz = arrayOf(
        arrayOf(1, 2),
        arrayOf(3, 4)
    )
    println(matriz[1][0])

}