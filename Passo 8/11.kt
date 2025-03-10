fun main() {
    val idades = IntArray(8)
    var somaIdades = 0
    var maiorIdade = 0
    val maioresDe25 = mutableListOf<Int>()
    val posicoesMaiorIdade = mutableListOf<Int>()

    for (i in idades.indices) {
        println("Digite a idade da pessoa ${i + 1}:")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]

        if (idades[i] > 25) {
            maioresDe25.add(i)
        }

        if (idades[i] > maiorIdade) {
            maiorIdade = idades[i]
            posicoesMaiorIdade.clear()
            posicoesMaiorIdade.add(i)
        } else if (idades[i] == maiorIdade) {
            posicoesMaiorIdade.add(i)
        }
    }

    val mediaIdade = somaIdades / idades.size
    println("Média de idade: $mediaIdade")
    
    if (maioresDe25.isNotEmpty()) {
        println("Posições com pessoas acima de 25 anos: ${maioresDe25.joinToString()}")
    } else {
        println("Nenhuma pessoa tem mais de 25 anos.")
    }

    println("A maior idade digitada foi: $maiorIdade")
    println("Posições com a maior idade: ${posicoesMaiorIdade.joinToString()}")
}
