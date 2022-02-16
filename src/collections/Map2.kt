package collections

fun main(args: Array<String>) {
    var map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Cibalena")
    for ((id, nome) in map) {
        println("$id) $nome")
    }
}