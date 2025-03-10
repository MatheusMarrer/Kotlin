fun main() {
    print("Digite o valor da casa: R$")
    val valorCasa = readLine()!!.toFloat()
    print("Digite o seu salário: R$")
    val salario = readLine()!!.toFloat()
    print("Quantos anos de financiamento? ")
    val anos = readLine()!!.toInt()

    val prestacao = valorCasa / (anos * 12)
    if (prestacao > salario * 0.30) {
        println("Empréstimo negado. A prestação mensal excede 30% do seu salário.")
    } else {
        println("Empréstimo aprovado! A prestação mensal será R$%.2f".format(prestacao))
    }
}
