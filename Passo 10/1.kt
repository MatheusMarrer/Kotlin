fun main() {
    println("Digite o primeiro valor:")
    val valor1 = readLine()!!.toInt()

    println("Digite o segundo valor:")
    val valor2 = readLine()!!.toInt()

    val resultado = Somador(valor1, valor2)

    println("A soma entre $valor1 e $valor2 é: $resultado")
}

fun Somador(v1: Int, v2: Int): Int {
    return v1 + v2
}

