fun main() {
    print("Quantas horas de atividade física você teve no mês? ")
    val horas = readLine()!!.toInt()

    val pontos = when {
        horas <= 10 -> horas * 2
        horas in 11..20 -> horas * 5
        else -> horas * 10
    }

    val dinheiro = pontos * 0.05
    println("Você ganhou $pontos pontos, que correspondem a R$%.2f".format(dinheiro))
}
