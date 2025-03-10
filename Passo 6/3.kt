fun main() {
    var somaValores = 0
    var quantidadeValores = 0
    var menorValor = Int.MAX_VALUE
    var quantidadePares = 0
    var continuar: String

    do {
        print("Digite um número: ")
        val numero = readLine()!!.toInt()

        somaValores += numero
        quantidadeValores++

        if (numero < menorValor) {
            menorValor = numero
        }

        if (numero % 2 == 0) {
            quantidadePares++
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.toUpperCase()
    } while (continuar == "S")

    val mediaValores = if (quantidadeValores > 0) somaValores / quantidadeValores else 0

    println("Somatório de todos os valores: $somaValores")
    println("Menor valor digitado: $menorValor")
    println("Média entre todos os valores: $mediaValores")
    println("Quantidade de números pares: $quantidadePares")
}
