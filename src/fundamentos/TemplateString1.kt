package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("Brunna", "Vitor", "Yara")
    println("O 1° colocado foi ${aprovados[0]}.")
    println("O 2° colocado foi ${aprovados[1]}.")
    println("O 3° colocado foi ${aprovados[2]}.")

    val reprovados = listOf("Yasmin", "Gabriel",)
    println("${reprovados[0]} foi reprovado em primeiro.")
    println("${reprovados[1]} foi reprovado em segundo.")
}