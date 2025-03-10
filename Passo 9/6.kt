fun main() {
    println("Digite o primeiro valor:")
    val valor1 = readLine()!!.toInt()

    println("Digite o segundo valor:")
    val valor2 = readLine()!!.toInt()

    Maior(valor1, valor2)
}

fun Maior(v1: Int, v2: Int) {
    if (v1 > v2) {
        println("O maior valor é: $v1")
    } else if (v2 > v1) {
        println("O maior valor é: $v2")
    } else {
        println("Os dois valores são iguais.")
    }
}
