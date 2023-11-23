package clases

class mario (var vidas: Int =3){
    init {
        println("It's me Mario")
    }
    private var state ="Smail"
    private var  lives = 3
    private fun die(){
        lives--
        println("Has perdido una vida ")
    }
    fun collision(collectionObj: String){
        when(collectionObj){
            "Goomba" -> die()
            "Super Mushroom" -> state   = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }
    fun getLive(): String{
        return "$lives vidas"
    }
}