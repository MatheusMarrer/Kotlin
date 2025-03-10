fun main() {
    val vetor = IntArray(15)
    vetor[0] = 1
    vetor[1] = 1
    for (i in 2 until 15) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }
    println(vetor.joinToString(" "))
    println((0..14).joinToString(" ") { it.toString().padStart(2, ' ') })
}
