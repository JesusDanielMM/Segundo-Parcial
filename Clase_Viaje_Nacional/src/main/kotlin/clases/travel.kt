package clases

abstract class travel {
    abstract  val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    abstract fun quotePrice (numDays: Int)
    protected abstract fun getPrice (numDay: Int): Int

    fun reserve(numDays: Int){
        if (reserved){
            println("""¡Ya reservaste tu viaje! 
                Pais: $country
                Ciudad: $city
                Precio: $paidAmount""".trimMargin())
            return
        }
        val amount =  getPrice(numDays)
        if (amount==0){
            return
        }
        reserved =  true
        paidAmount =  amount
        println("""¡Ya reservaste tu viaje! 
                Pais: $country
                Ciudad: $city
                Precio: $paidAmount""".trimMargin())
    }
}