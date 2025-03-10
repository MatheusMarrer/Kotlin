fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    val maior = Maior(num1, num2, num3)

    println("O maior número entre $num1, $num2 e $num3 é: $maior")
}

fun Maior(n1: Int, n2: Int, n3: Int): Int {
    return maxOf(n1, n2, n3)
}
