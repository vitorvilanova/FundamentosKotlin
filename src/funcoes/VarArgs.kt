package funcoes

fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}

fun main(args: Array<String>){
    for(n in ordenar(38, 3, 100, 199, 1993, 1224)){
        print("$n ")
    }
}