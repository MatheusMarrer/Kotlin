fun main() {
    println("Digite um valor:")
    val numero = readLine()!!.toInt()

    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }
}

