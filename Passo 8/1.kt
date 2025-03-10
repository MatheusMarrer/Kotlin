fun main() {

    val vetor = IntArray(8) { 999 }
    println(vetor.joinToString(" "))
    println((0..7).joinToString(" ") { it.toString().padStart(3, ' ') })
}
