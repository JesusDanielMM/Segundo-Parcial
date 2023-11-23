package clases

open class Enemy(val name:String, val Strength: String) {
    init {
        println("Inicia ")
    }
    protected var direction: String="LEFT"
    protected fun changeDirection(){
        direction = if (direction=="RIGHt") "Left" else "right"
        println("$name va a direccion $direction")
    }
    protected fun die(){
        println("$name ha muerto")
    }
    open fun collision(collider:String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}