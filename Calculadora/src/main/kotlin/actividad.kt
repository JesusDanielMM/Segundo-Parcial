import kotlin.reflect.KFunction2

fun main (){
    fun oferta(precio: Double, cupon: String, total: KFunction2<Double, String, Any>): Any {
        return total(precio, cupon)

    }

    fun opcion(precio: Double, cupon: String)=
        when (cupon) {
            "NOIVA" -> precio
            "HALFIVA" -> (precio)+(precio*0.08)
            "MINUS100" -> (precio)-100
            "PROMO2020" -> when {
                precio >=0 && precio <1000 -> (precio)+(precio*0.12)
                precio in 1000.0..2000.0 -> (precio)+(precio*0.04)
                precio >2000 && precio <4000 -> ((precio*0.08)+precio)/2
                else -> precio-((precio/3)*2)
            }
            else -> (precio)+(precio*0.08)
        }



    val noiva = oferta(1000.0, "NOIVA", :: opcion)
    println(noiva)
    val halfiva = oferta(1000.0, "HALFIVA", :: opcion)
    println(halfiva)

    val minus100 = oferta(1000.0, "MINUS100", :: opcion)
    println(minus100)

    val promo20201 = oferta(100.0, "PROMO2020", :: opcion)
    println(promo20201)
    val promo20202 = oferta(1500.0, "PROMO2020", :: opcion)
    println(promo20202)
    val promo20203 = oferta(3000.0, "PROMO2020", :: opcion)
    println(promo20203)
    val promo20204 = oferta(6000.0, "PROMO2020", :: opcion)
    println(promo20204)
}