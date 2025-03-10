fun main() {
    val vetor = IntArray(20) { (0..99).random() }

    println("Números gerados aleatoriamente:")
    println(vetor.joinToString(", "))

    vetor.sort()

    println("Valores ordenados em ordem crescente:")
    println(vetor.joinToString(", "))
}
