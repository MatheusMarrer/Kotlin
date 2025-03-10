fun main() {
    var maiorIdade = 0
    var totalHomens = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var somaIdadesHomens = 0
    var continuar: String

    do {
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!.toUpperCase()

        if (sexo == "M") {
            totalHomens++
            somaIdadesHomens += idade
        }

        if (idade > maiorIdade) maiorIdade = idade
        if (sexo == "F" && idade < idadeMulherMaisJovem) idadeMulherMaisJovem = idade

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.toUpperCase()
    } while (continuar == "S")

    val mediaIdadesHomens = if (totalHomens > 0) somaIdadesHomens / totalHomens else 0

    println("Maior idade lida: $maiorIdade")
    println("Número de homens cadastrados: $totalHomens")
    println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    println("Média de idade entre os homens: $mediaIdadesHomens")
}
