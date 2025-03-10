fun main() {
    println("Digite a base:")
    val base = readLine()!!.toInt()

    println("Digite o expoente:")
    val expoente = readLine()!!.toInt()

    val resultado = Potencia(base, expoente)

    println("$base elevado a $expoente é: $resultado")
}

fun Potencia(base: Int, expoente: Int): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}
