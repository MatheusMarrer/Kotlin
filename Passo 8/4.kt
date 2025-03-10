fun main() {
    val vetor = IntArray(10) { if (it % 2 == 0) 5 else 3 }
    println(vetor.joinToString(" "))
    println((0..9).joinToString(" ") { it.toString().padStart(2, ' ') })
}
