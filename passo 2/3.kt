fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine()!!
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()
    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()
    val media = (nota1 + nota2) / 2
    println("A média do aluno $nome é: %.1f".format(media))
    if (media >= 7.0) {
        println("O aluno teve um bom aproveitamento!")
    } else {
        println("O aluno não teve um bom aproveitamento.")
    }
}
