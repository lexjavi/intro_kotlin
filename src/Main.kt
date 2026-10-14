//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")

    //variables
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


}