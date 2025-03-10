fun main() {
    var somaIdade = 0
    var maisDe18 = 0
    var menosDe5 = 0
    var maiorIdade = 0

    for (i in 1..10) {
        print("Digite a idade da $iº pessoa: ")
        val idade = readLine()!!.toInt()

        somaIdade += idade

        if (idade > 18) maisDe18++
        if (idade < 5) menosDe5++

        if (idade > maiorIdade) maiorIdade = idade
    }

    val mediaIdade = somaIdade / 10
    println("Média de idade: $mediaIdade")
    println("Pessoas com mais de 18 anos: $maisDe18")
    println("Pessoas com menos de 5 anos: $menosDe5")
    println("Maior idade: $maiorIdade")
}
