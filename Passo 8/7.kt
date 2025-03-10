fun main() {
    val nomes = Array(7) { readLine()!! }
    println(nomes.reversed().joinToString(" "))
}
