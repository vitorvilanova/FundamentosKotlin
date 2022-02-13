package funcoes

class Produto(val nome: String, val preco: Double)

infix  fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.39, nome =  "Borracha")
    println(p1 maisCaroQue  p2)
    //chamando modo tradicional infix
    // 1 + 1 é um modelo de infix (+)
    println(p2.maisCaroQue(p1))
}