fun main() {
    val notas = DoubleArray(10)
    var somaNotas = 0.0
    var maiorNota = 0.0
    val posicoesMaiorNota = mutableListOf<Int>()

    for (i in notas.indices) {
        println("Digite a nota do aluno ${i + 1}:")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]

        if (notas[i] > maiorNota) {
            maiorNota = notas[i]
            posicoesMaiorNota.clear()
            posicoesMaiorNota.add(i)
        } else if (notas[i] == maiorNota) {
            posicoesMaiorNota.add(i)
        }
    }

    val mediaTurma = somaNotas / notas.size
    val acimaDaMedia = notas.count { it > mediaTurma }

    println("Média da turma: $mediaTurma")
    println("Número de alunos acima da média: $acimaDaMedia")
    println("A maior nota digitada foi: $maiorNota")
    println("Posições com a maior nota: ${posicoesMaiorNota.joinToString()}")
}
