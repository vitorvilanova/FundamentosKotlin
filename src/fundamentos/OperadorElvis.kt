package fundamentos

fun main(args: Array<String>) {
    val opcional : String? = null
    val obrigatorio : String = opcional ?: "Valor Padrão" //?: traz o valor padrao quando não possuo nada definido na variavel, coom no caso a variave é opcional.
    println(obrigatorio)
}