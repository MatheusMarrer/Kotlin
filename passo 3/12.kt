fun main() {
    print("Digite o salário atual: R$")
    val salario = readLine()!!.toFloat()
    print("Digite o gênero (M para masculino ou F para feminino): ")
    val genero = readLine()!!.toUpperCase()
    print("Quantos anos de empresa? ")
    val anos = readLine()!!.toInt()

    val novoSalario = when {
        genero == "F" && anos < 15 -> salario * 1.05f
        genero == "F" && anos in 15..20 -> salario * 1.12f
        genero == "F" && anos > 20 -> salario * 1.23f
        genero == "M" && anos < 20 -> salario * 1.03f
        genero == "M" && anos in 20..30 -> salario * 1.13f
        else -> salario * 1.25f
    }

    println("O novo salário é: R$%.2f".format(novoSalario))
}

