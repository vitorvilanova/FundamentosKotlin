package classes

class Clientes {
    constructor(nome: String) {
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val c1 = Clientes("")
    println(c1.nome)
    val c2 = Clientes("Pedro")
    println(c2.nome)
}
