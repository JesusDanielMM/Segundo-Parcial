import Clases.Goomba
import clases.Phone
import clases.vehiculo
import clases.Mario
import clases.Enemy

fun main() {
    val myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.turnOff()
    //Clase Vehiculo
    val myCoche = vehiculo(marca="Ford",modelo="Focus",color="verde")


    var mario = Mario()
    /*for (i in 1..5){
            if(mario.isAlive){
                    mario.collision("Goomba")
                    println("Te quedan ${mario.getLives()}")
            }
            println("Te quedan ${mario.getLives()}")
    }*/
    mario.collision("star")
    /*val enemy = Enemy("Un enemigo",2)
    enemy.collision("Enemy")
    enemy.collision("Weapon")*/
    val enemy = Goomba()
    enemy.collision("Enemy")
    enemy.collision("Weapon")
    val koopa = Koopa()
    koopa.collision("Weapon")


    myCoche.placas="REM-4123"
    println("El coche esta prendido? ${myCoche.encendido}")
    myCoche.VturnOn()
    println("El coche esta prendido? ${myCoche.encendido}")
    println("El tanque tiene ${myCoche.gasolina}")
    myCoche.recargar(20.07f)
    println("El tanque tiene ${myCoche.gasolina}")
    println("El tanque ahora tiene ${myCoche.gasolina}")
    val golNegro = vehiculo("Volkswagen", "Gol")
    // Crear un nuevo auto pasandole todos los argumentos con NamedArguments
    val sonicAzul = vehiculo(
        marca = "Ford",
        modelo = "Sonic",
        color = "Azul",
        placas = "ALS9763"
    )
    println(golNegro)
    println(sonicAzul)
}
