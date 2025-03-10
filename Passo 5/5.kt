fun main() {
    var nomePessoaMaisVelha = ""
    var idadePessoaMaisVelha = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var somaIdadesGrupo = 0
    var totalPessoas = 0
    var homensMaisDe30 = 0
    var mulheresMenosDe18 = 0
    var continuar: String

    do {
        print("Digite o nome da pessoa: ")
        val nome = readLine()!!

        print("Digite a idade da pessoa: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!.toUpperCase()

        somaIdadesGrupo += idade
        totalPessoas++

        if (idade > idadePessoaMaisVelha) {
            idadePessoaMaisVelha = idade
            nomePessoaMaisVelha = nome
        }

        if (sexo == "F" && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }

        if (sexo == "M" && idade > 30) homensMaisDe30++
        if (sexo == "F" && idade < 18) mulheresMenosDe18++

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.toUpperCase()
    } while (continuar == "S")

    val mediaIdadesGrupo = if (totalPessoas > 0) somaIdadesGrupo / totalPessoas else 0

    println("Nome da pessoa mais velha: $nomePessoaMaisVelha")
    println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    println("Média de idade do grupo: $mediaIdadesGrupo")
    println("Homens com mais de 30 anos: $homensMaisDe30")
    println("Mulheres com menos de 18 anos: $mulheresMenosDe18")
}
