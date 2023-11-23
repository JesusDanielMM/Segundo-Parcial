package clases

open class Nacional(override val city:String):travel(){
    override val country = "Mexico"
        protected val fees = mapOf(
            "Monterrey" to 400,
            "Guadalajara" to 350,
            "CDMX" to 360,
            "San Cristobal de las casas" to 240,
            "San Miguel de Allende" to 320
        )

    override fun getPrice(numDay: Int): Int {
        val fee = fees[city]
        return  if(fee==null) 0 else fee*numDay
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price==0){
            println("Lo siento, no hacemos viajes a esta ciudad")
        }else{
            println("Tu viaje a $city cuesta \$$price")
        }
    }
}