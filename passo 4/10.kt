fun main() {
    var soma = 0
    for (i in 1..7) {
        print("Digite o $iº número: ")
        soma += readLine()!!.toInt()
    }
    println("A soma dos números é: $soma")
}
