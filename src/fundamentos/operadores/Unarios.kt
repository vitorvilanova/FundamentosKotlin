package fundamentos.operadores

fun main(args: Array<String>) {
    var num1 : Int = 1
    var num2 : Int = 2
    num1++
    println(num1)
    --num1
    println(num1)

    /*
    Incremento e decremento
    pre fixado  ++num1 ele incrementa antes da execução
    pos fixado num2-- ele decrementa apos a execução
     */

    println(++num1 == num2--)   //Resultado sera true; Porque os dois numeros serão 2


    println(num1 == num2) // Resultado sera false, porque ja executou e alterou as variaveis
}