fun main() {
    println("Digite a primeira nota: ")
    var n1 = readLine()!!.toDouble()
    println("Digite a segunda nota: ")
    var n2 = readLine()!!.toDouble()
    var media = (n1 + n2) / 2
    when {
        media <= 4.9 -> println("REPROVADO")
        media in 5.0..6.9 -> println("RECUPERAÇÃO")
        media >= 7 -> println("APROVADO")
    }
}
