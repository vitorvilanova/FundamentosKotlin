package funcoes



inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

/*
nao posso ter nome de funcoes top level, no mesmo pacote.
No nosso caso ja temos uma funcao top level chamado somar no arquivo FuncaoComoParam1
 */

fun somar2(a: Int, b: Int): Int {
    return a + b
}
fun main(args: Array<String>) {
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }
    println(resultado)
}