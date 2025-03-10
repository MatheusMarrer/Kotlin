fun main() {
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toDouble()

    val media = Media(nota1, nota2)
    val situacao = Situacao(media)

    println("A média do aluno é: $media")
    println("Situação: $situacao")
}

fun Media(n1: Double, n2: Double): Double {
    return (n1 + n2) / 2
}

fun Situacao(media: Double): String {
    return when {
        media >= 7 -> "APROVADO"
        media >= 5 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}
