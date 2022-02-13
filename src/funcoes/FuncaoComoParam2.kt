package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for(e in lista) {
        if(filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 5
}

fun main(args: Array<String>) {
    val nomes = listOf("Vitor", "Bruna", "Rita", "Cleude", "Paulo")
    println(filtrar(nomes, ::comTresLetras))
}
