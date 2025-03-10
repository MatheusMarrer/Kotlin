fun main() {
    val numeros = IntArray(10) { readLine()!!.toInt() }
    println(numeros.joinToString(" "))
    println(numeros.mapIndexedNotNull { index, num -> if (num % 2 == 0) "Posição $index: $num" else null }.joinToString("\n"))
}
