package lambdas

class Calculadoras {
    var resultado = 0
    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }
    fun add(valor: Int) {
        resultado += valor
    }
}
fun main(args: Array<String>) {
    val calculadora = Calculadoras()
    calculadora.apply { soma(4, 5) }.apply { add(5) }.apply { println(resultado)
    }
    calculadora.apply {
        soma(4, 5)
        add(5)
        print(resultado)
    }
    // inline function
    with(calculadora) {
        soma(4, 5)
        add(5)
        print(resultado)
    }
}