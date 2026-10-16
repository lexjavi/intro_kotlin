//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")

    /*//variables
    //var (mutables) y val (inmutables)
    val num1:Int = 10
    val edad = 22

    var num2:Int
    var precio = 10.0

    val nombre: String  = "Alex"
    val edad2: Int = 21
    val num: Double = 3.4
    val esEstudiante:Boolean  = true
    val peso: Float = 67.3f
    val inicial: Char = 'A'

    //operadores (+, -, *, /, %)
    val numeroa = 10
    val numerob = 20
    // total es inmutable, debido a que es la respuesta es una operacion entre valores inmutables
    val total = numeroa + numerob
    //println("la suma es: " + total)
    //concatenacion correcta
    println("la suma es: $total")

    //Ingresar datos por teclado
    println("Escriba su nombre: ")
    val nombre1 = readln()
    println("Escriba su apelido: ")
    val apellido = readln()
    println("La persona con nombre: $nombre1 y con apellido: $apellido ha ingresado al sistema")

    println("Escriba un numero ")
    val numeroIngresado1 = readln().toInt()
    println("ingrese otro numero")
    val numeroIngresado2 = readln().toInt()
    val operacion = numeroIngresado1 + numeroIngresado2
    println("La suma de $numeroIngresado1 y $numeroIngresado2 es $operacion")
*/
    //estructuras de control
    //if
    val number5 = 5;
    if(number5 % 2 == 0){
        println("El numero es par")
    }else{
        println("El numero es impar")
    }

    //if anidado
    if(number5 >= 7){
        println("Aprobo la materia")

    }else if((number5 >= 5) and  (number5 < 7)){
        print("Se quedo en supletorio")
    }else {
        print("Reprobo la materia")
    }
    //switch
    val opcion = 67
    when(opcion){
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        else -> println("Numero no registrado, registre un numero del 1 al 3") //sustituye el default

    }
    //estructuras de repeticion
    //for
    for(i in 1..10){
        println(i)
    }
    for(i in 10 downTo 1){ //del ultimo al primero
        println(i)
    }
    for(i in 1..10 step 2){ //imprime de dos en dos
        println(i)
    }
    for(i in 10 downTo 1 step 2){ //imprime de dos en dos al reves
        println(i)
    }
    //while
    var i = 1
    while(i <= 10){
        println(i)
        i++
    }
     //do while
    var j = 0
    do{
        println(j)
        j++
    }while(j < 10)

    //vectores y arreglos
    // en el caso de vectores
    val numeros = IntArray(3)
    numeros[0] = 1
    numeros[1] = 2
    numeros[2] = 5
    val numeros2 = intArrayOf(1, 2, 3, 4, 5)
    for(i in numeros.indices){
        println(numeros[i])
    }
    for(i in numeros2.indices){
        println(numeros2[i])
    }

    //arreglos
    val matriz1 = Array(3){IntArray(3)} //Array para filas e IntArray para columnas
    val matriz2 = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(1, 2, 3, 4),
        intArrayOf(1, 2, 3, 4),
        intArrayOf(1, 2, 3, 4)
    )



}