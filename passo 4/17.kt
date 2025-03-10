import java.util.*

fun main() {
    val numeroSorteado = Random().nextInt(10) + 1
    var tentativas = 0
    var acertou = false

    println("Tente adivinhar o número entre 1 e 10. Você tem 4 tentativas!")

    while (tentativas < 4 && !acertou) {
        print("Tentativa ${tentativas + 1}: ")
        val palpite = readLine()!!.toInt()

        if (palpite == numeroSorteado) {
            println("Parabéns! Você acertou o número!")
            acertou = true
        } else {
            println("Errou! Tente novamente.")
        }
        tentativas++
    }

    if (!acertou) {
        println("Você perdeu! O número sorteado era: $numeroSorteado")
    }
}
