fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    val resultado = SuperSomador(num1, num2)

    println("A soma de todos os valores entre $num1 e $num2 é: $resultado")
}

fun SuperSomador(n1: Int, n2: Int): Int {
    var soma = 0
    for (i in n1..n2) {
        soma += i
    }
    return soma
}
