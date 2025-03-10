fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    ParOuImpar(numero)
}

fun ParOuImpar(num: Int) {
    if (num % 2 == 0) {
        println("O número $num é PAR.")
    } else {
        println("O número $num é ÍMPAR.")
    }
}
