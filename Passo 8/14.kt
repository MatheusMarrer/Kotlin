fun main() {
    val nomes = Array(9) { "" }
    val idades = IntArray(9)

    for (i in 0 until 9) {
        println("Digite o nome da pessoa ${i + 1}:")
        nomes[i] = readLine()!!.toString()
        println("Digite a idade de ${nomes[i]}:")
        idades[i] = readLine()!!.toInt()
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until 9) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}
