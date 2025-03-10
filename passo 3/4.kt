fun main() {
    print("Digite o nome do funcionário: ")
    val nome = readLine()!!
    print("Digite o salário atual: R$")
    val salario = readLine()!!.toFloat()
    print("Quantos anos de empresa? ")
    val anos = readLine()!!.toInt()

    val novoSalario = when {
        anos <= 3 -> salario * 1.03f
        anos in 4..10 -> salario * 1.125f
        else -> salario * 1.20f
    }

    println("O novo salário de $nome é: R$%.2f".format(novoSalario))
}
