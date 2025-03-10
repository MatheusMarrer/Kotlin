import java.util.*

fun main() {
    val numeroSorteado = Random().nextInt(5) + 1
    print("Tente adivinhar o número sorteado entre 1 e 5: ")
    val palpite = readLine()!!.toInt()

    if (palpite == numeroSorteado) {
        println("Parabéns! Você acertou o número.")
    } else {
        println("Você errou! O número sorteado era $numeroSorteado.")
    }
}
