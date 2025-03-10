fun main() {
    println("Digite o primeiro valor:")
    val valor1 = readLine()!!.toInt()

    println("Digite o segundo valor:")
    val valor2 = readLine()!!.toInt()

    Somador(valor1, valor2)
}

fun Somador(v1: Int, v2: Int) {
    val soma = v1 + v2
    println("A soma entre $v1 e $v2 é: $soma")
}
