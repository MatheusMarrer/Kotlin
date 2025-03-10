fun main() {
    var totalAlunos = 0
    var somaIdades = 0
    var idade: Int

    do {
        print("Digite a idade do aluno (999 para parar): ")
        idade = readLine()!!.toInt()

        if (idade != 999) {
            totalAlunos++
            somaIdades += idade
        }
    } while (idade != 999)

    val mediaIdade = if (totalAlunos > 0) somaIdades / totalAlunos else 0
    println("Número de alunos na turma: $totalAlunos")
    println("Média de idade da turma: $mediaIdade")
}
