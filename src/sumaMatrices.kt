fun main(){
    //Suma de matrices
    val matriz1 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    val matriz2 = Array(3){ IntArray(3) }
    for(i in matriz2.indices){
        for(j in matriz2.indices){
            println("Ingresa el numero en $i  $j")
            val numero = readln().toInt()
            matriz2[i][j] = numero
        }

    }
    println("Primera matriz")
    for(i in matriz1.indices){
        for(j in matriz1.indices){
            println("${matriz1[i][j]}")
        }
        println()
    }
    println("Segunda matriz")
    for(i in matriz2.indices){
        for(j in matriz2.indices){
            println("${matriz2[i][j]}")
        }
        println()
    }
    val matrizResultado = Array(3) { IntArray(3) }
    for(i in matrizResultado.indices){
        for(j in matrizResultado.indices){
            matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }
    println("Matriz resultado")
    for(i in matrizResultado.indices){
        for(j in matrizResultado.indices){
            println("${matrizResultado[i][j]}")
        }
        println()
    }


}