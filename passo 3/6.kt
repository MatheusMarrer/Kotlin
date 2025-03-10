import java.util.*

fun main() {
    val opcoes = arrayOf("Pedra", "Papel", "Tesoura")
    val random = Random()

    println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura")
    val jogadorEscolha = readLine()!!.toInt()
    val computadorEscolha = random.nextInt(3)

    println("Você escolheu: ${opcoes[jogadorEscolha]}")
    println("O computador escolheu: ${opcoes[computadorEscolha]}")

    if (jogadorEscolha == computadorEscolha) {
        println("Empate!")
    } else if ((jogadorEscolha == 0 && computadorEscolha == 2) ||
               (jogadorEscolha == 1 && computadorEscolha == 0) ||
               (jogadorEscolha == 2 && computadorEscolha == 1)) {
        println("Você ganhou!")
    } else {
        println("Você perdeu!")
    }
}
