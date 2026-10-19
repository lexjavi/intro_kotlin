// Primera forma
class Persona{
    var nombre: String = ""
    var edad: Int = 0
    var estatura: Double = 0.0
}

//Segunda forma
//No existen getters y setters
class Vehiculo(var marca: String, var precio: Double, var anio: Int, var cilindraje: Double){
    var velocidadActual: Int = 0
    // funciones
    //funciones de tipo void, sin retornar
    fun encender(){
        println("El vehiculo se ha encendido")
    }
    //funcion de retorno
    fun apagar(): String{
        return "El vehiculo se ha apagado"
    }
    // recibe parametros y los devuelve
    fun acelerar(incremento: Int): Int{
        velocidadActual += incremento
        return velocidadActual
    }

    fun frenar(decremento: Int): Int{
        velocidadActual -= decremento
        if(velocidadActual < 0){
            velocidadActual = 0
        }
        return velocidadActual
    }

    fun pitar(veces: Int): String{
        var sonido = " "
        for(i in 1..veces){
            sonido += "¡BEEP! "
        }
        return sonido
    }
    fun mostrarDetalles(vehiculo: Vehiculo): String{
        return "[Marca: ${vehiculo.marca}, Precio: ${vehiculo.precio}, Año: ${vehiculo.anio} , Cilindraje: ${vehiculo.cilindraje}]"

    }
}
fun main(){
    val carro1 = Vehiculo("Kia", 16500.00, 2020, 1.5)
    //println(carro1.marca) //el get
    //carro1.precio = 17000.00 // el set
    //println(carro1.precio)
    println(carro1.mostrarDetalles(carro1))
    carro1.encender()
    println(carro1.acelerar(50))
    println(carro1.frenar(25))
    println(carro1.pitar(10))
    println(carro1.apagar())



}