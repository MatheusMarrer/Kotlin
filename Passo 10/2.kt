fun main() {
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toDouble()

    val media = Media(nota1, nota2)

    println("A média do aluno é: $media")
}

fun Media(n1: Double, n2: Double): Double {
    return (n1 + n2) / 2
}
