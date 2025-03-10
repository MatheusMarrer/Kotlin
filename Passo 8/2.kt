fun main() {
    val vetor = IntArray(10) { it * 5 + 5 }
    println(vetor.joinToString(" "))
    println((0..9).joinToString(" ") { it.toString().padStart(2, ' ') })
}
