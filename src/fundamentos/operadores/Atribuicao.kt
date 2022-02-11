package fundamentos.operadores

//operadores de atribuicao
fun main(args: Array<String>) {
    var a : Int = 7
    var b : Int = 100
    b += a // b = b + a
    b -= 4 // b = b - 4
    b *= 2 // b = b * 2
    b /= 2 // b = b / 2
    b %= 2

    println(b)
}