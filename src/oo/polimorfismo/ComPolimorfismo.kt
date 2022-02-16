package oo.polimorfismo

open class Comida(val peso: Double)
class Agua(peso: Double) : Comida(peso)
class Suco(peso: Double) : Comida(peso)
class Refri(peso: Double) : Comida(peso)
class Alguem(var peso: Double) {
    fun beber(comida: Comida) {
        peso += comida.peso
    }
}
fun main(args: Array<String>) {
    val agua = Agua(0.3)
    val suco = Suco(0.3)
    val refri = Refri(0.2)
    val joao = Alguem(80.5)
    joao.beber(agua)
    joao.beber(suco)
    joao.beber(refri)
    println(joao.peso)
}