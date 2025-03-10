fun main() {
    val vetor = IntArray(30) { (1..15).random() }
    println("Digite um número (chave) entre 1 e 15:")
    val chave = readLine()!!.toInt()
    var contador = 0

    for (i in vetor.indices) {
        if (vetor[i] == chave) {
            println("Chave encontrada na posição $i")
            contador++
        }
    }

    println("A chave foi sorteada $contador vezes.")
}

