package funcoes

//Exemplo 1
fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

//Exemplo 2
fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

//Exemplo 3
fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

//Exemplo 4
fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

//Exemplo 5
fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>){
    imprimeMaior1(1, 0)
    imprimeMaior2(2,1)
    imprimeMaior3(3,2)
    imprimeMaior4(4, 3)
    imprimeMaior5(5, 4).run { 2 > 1 }.run { print("Resultado = $this") }
}

//void do java foi substituido pelo unit no kotlin
