package fundamentos.controles

fun main(args: Array<String>) {
    val alunos = arrayListOf("Brunna", "Vitor", "Vitorinha", "Estopa")
    for ((indice, aluno) in alunos.withIndex()) {
        //println("${indice+1} - $aluno \n" )  //incrementa o indice, para nao ficar 0
        println("$indice - $aluno \n" ) //inicia a condagem o indice em 0
    }
}