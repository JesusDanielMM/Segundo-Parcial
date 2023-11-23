package clases
import  clases.Nacional
import interfases.IPromotion

class NacionalLowSeason(city:String) : Nacional(city),IPromotion {
    override val discount = 10
    override val typeDiscount = 0

    override fun getPrice(numDay: Int): Int {
        val amount = super.getPrice(numDay)
        return if(amount ==0 ) 0 else getDiscountPrice(amount)
    }
}