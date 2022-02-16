package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }
    override fun equals(other: Any?): Boolean {
        if(other is Objeto) {
            return nome.equals(other.nome, ignoreCase = true)
        } else {
            return false
        }
    }
}
fun main(args: Array<String>) {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), // Hashcode = 7
        Objeto("Mesa", "..."), // Hashcode = 4
        Objeto("Prato", "..."), // Hashcode = 6
        Objeto("Colher", "...") // Hashcode = 6
    )
    conjunto.contains(Objeto("prato", "???")).print()
}
