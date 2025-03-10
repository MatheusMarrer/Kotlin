fun main() {
    var maiorPreco = 0.0
    var menorPreco = Double.MAX_VALUE

    for (i in 1..8) {
        print("Digite o preço do $iº produto: R$")
        val preco = readLine()!!.toDouble()

        if (preco > maiorPreco) maiorPreco = preco
        if (preco < menorPreco) menorPreco = preco
    }

    println("O maior preço é R$ $maiorPreco")
    println("O menor preço é R$ $menorPreco")
}
