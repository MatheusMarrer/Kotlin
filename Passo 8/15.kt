fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)

    for (i in 0 until 5) {
        println("Digite o nome do funcionário ${i + 1}:")
        nomes[i] = readLine()!!.toString()
        println("Digite o sexo do funcionário ${i + 1} (M/F):")
        sexos[i] = readLine()!!.toString()
        println("Digite o salário do funcionário ${i + 1}:")
        salarios[i] = readLine()!!.toDouble()
    }

    println("\nFuncionárias mulheres que ganham mais de R$ 5.000:")
    for (i in 0 until 5) {
        if (sexos[i] == "F" && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Sexo: ${sexos[i]}, Salário: R$ ${salarios[i]}")
        }
    }
}
