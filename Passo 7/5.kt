fun main() {
    var totalMulheres = 0
    var totalHomensAcima100kg = 0
    var somaPesosMulheres = 0.0
    var maiorPesoHomem = 0.0

    for (i in 1..8) {
        println("Pessoa $i:")
        println("Digite o sexo (M para masculino e F para feminino):")
        val sexo = readLine()!!.toUpperCase()

        println("Digite o peso:")
        val peso = readLine()!!.toDouble()

        if (sexo == "F") {
            totalMulheres++
            somaPesosMulheres += peso
        } else if (sexo == "M" && peso > 100) {
            totalHomensAcima100kg++
        }

        if (sexo == "M" && peso > maiorPesoHomem) {
            maiorPesoHomem = peso
        }
    }

    // Calculando a média de peso entre as mulheres
    val mediaPesoMulheres = if (totalMulheres > 0) somaPesosMulheres / totalMulheres else 0.0

    println("Total de mulheres cadastradas: $totalMulheres")
    println("Total de homens que pesam mais de 100kg: $totalHomensAcima100kg")
    println("Média de peso entre as mulheres: %.2f".format(mediaPesoMulheres))
    println("Maior peso entre os homens: %.2f".format(maiorPesoHomem))
}
