fun main() {
    fun calculadora(a:Int, b:Int, operacion:(Int,Int)->Int):Int {
        return operacion(a,b)
    }
    fun suma(a: Int, b:Int) = a+b
    fun resta(a: Int, b:Int) = a-b
    fun multiplica(a: Int, b:Int) = a*b


    val suma =  calculadora(5,6,::suma)
    println(suma)
    val resta =  calculadora(5,6,::resta)
    println(resta)
    val multiplica =  calculadora(5,6,::multiplica)
    println(multiplica)
}