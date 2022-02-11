package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    println(a?.inc())
    println("Hora do erro...")
    println(a!!.inc())

    //println(a!!.inc()) non-null asserted
    //println(a?.inc()) Only Safe
}