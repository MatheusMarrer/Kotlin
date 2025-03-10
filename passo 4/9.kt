fun main() {
    var soma = 0
    for (i in 500 downTo 0 step 50) {
        soma += i
    }
    println("A soma dos números é: $soma")
}
