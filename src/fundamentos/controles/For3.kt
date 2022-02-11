package fundamentos.controles

//Itera sobre um Intervalo Fixo (Com Passo)
fun main(args: Array<String>) {
    for(i in 0..100 step 5) {
        println(i)
    }
    for(i in 100 downTo 0 step 5) {
        println(i)
    }
}