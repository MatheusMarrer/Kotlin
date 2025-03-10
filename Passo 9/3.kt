fun main() {
    Gerador("Aprendendo Kotlin", 4)
}

fun Gerador(mensagem: String, repeticoes: Int) {
    println("+ ======= +")
    
    // Exibe a mensagem repetida o número de vezes indicado
    for (i in 1..repeticoes) {
        println(mensagem)
    }

    println("+ ======= +")
}

