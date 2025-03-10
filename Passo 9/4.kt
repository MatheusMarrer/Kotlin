fun main() {
    Gerador("Portugol Studio", 3, 2)
}

fun Gerador(mensagem: String, repeticoes: Int, borda: Int) {
    // Escolhe a borda com base no número passado
    val linhaBorda = when (borda) {
        1 -> "+-------=======------+"
        2 -> "~~~~~~~~:::::::~~~~~~~"
        3 -> "<<<<<<<------->>>>>>>>>"
        else -> "+-------=======------+" // Caso o número da borda seja inválido
    }

    println(linhaBorda)
    
    // Exibe a mensagem repetida o número de vezes indicado
    for (i in 1..repeticoes) {
        println(mensagem)
    }

    println(linhaBorda)
}
