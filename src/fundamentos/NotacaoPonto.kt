package fundamentos

fun main(args: Array<String>) {
    var a : Int = 777.dec()
    var b : String = a.toString()

    println("String: $a")
    println("Ultimo char da string a é: ${b.last()}")

    //Definição convertendo dentro do retorno
    println("String: $a")
    println("Ultimo char da string a é: ${(a.toString().last())}")
}