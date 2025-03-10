fun main() {
    print("Digite o ano de nascimento do rapaz: ")
    val anoNascimento = readLine()!!.toInt()
    val idade = 2025 - anoNascimento
    if (idade < 18) {
        val anosFaltando = 18 - idade
        println("Faltam $anosFaltando anos para o alistamento militar.")
    } else if (idade == 18) {
        println("Você deve se alistar este ano!")
    } else {
        val anosPassados = idade - 18
        println("Já se passaram $anosPassados anos desde o alistamento militar.")
    }
}
