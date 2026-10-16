fun main() {
    var positivos = 0
    var negativos = 0
    var ceros = 0
    var esMenu = true

    for(i in 1..10){
        println("Ingresa un numero")
        val numeroIngresado = readln().toInt()
        if(numeroIngresado > 0){
            positivos++
        }else if(numeroIngresado < 0){
            negativos++
        }else{
            ceros++
        }

    }
    do {
        println("Ingrese: 1 para resultados o 2 para finalizar")

        val opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Positivos: $positivos, negativos: $negativos, ceros: $ceros")
                esMenu = false
            }
            2 -> {
                println("Finalizando")
                esMenu = false
            }
            else -> {
                println("Opción inválida")
                esMenu = false
            }

        }

    } while (esMenu)
}