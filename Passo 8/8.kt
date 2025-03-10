fun main() {
    val numeros = IntArray(15) { readLine()!!.toInt() }
    println(numeros.joinToString(" "))
    println(numeros.mapIndexedNotNull { index, num -> if (num % 10 == 0) index else null }.joinToString(" "))
}
