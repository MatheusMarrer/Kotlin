fun main() {
    var somaIdade = 0
    var somaIdadeHomens = 0
    var homens = 0
    var mulheresComMaisDe20 = 0
    var mulheres = 0

    for (i in 1..5) {
        print("Digite a idade da $iº pessoa: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo da $iº pessoa (M/F): ")
        val sexo = readLine()!!.toUpperCase()

        somaIdade += idade
        if (sexo == "M") {
            homens++
            somaIdadeHomens += idade
        } else {
            mulheres++
            if (idade > 20) mulheresComMaisDe20++
        }
    }

    val mediaIdade = somaIdade / 5
    val mediaIdadeHomens = if (homens > 0) somaIdadeHomens / homens else 0
    println("Média de idade do grupo: $mediaIdade")
    println("Homens cadastrados: $homens")
    println("Mulheres cadastradas: $mulheres")
    println("Média de idade dos homens: $mediaIdadeHomens")
    println("Mulheres com mais de 20 anos: $mulheresComMaisDe20")
}
