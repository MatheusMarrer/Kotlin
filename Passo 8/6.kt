import kotlin.random.Random

fun main() {
    val vetor = IntArray(7) { Random.nextInt(1, 100) }
    println(vetor.joinToString(" "))
}
