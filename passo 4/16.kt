fun main() {
    var somaAltura = 0.0
    var pessoasMaisDe90Kg = 0
    var pessoasMenosDe50KgEMenosDe160cm = 0
    var pessoasMaisDe190cmEMaisDe100Kg = 0

    for (i in 1..7) {
        print("Digite o peso da $iº pessoa: ")
        val peso = readLine()!!.toDouble()

        print("Digite a altura da $iº pessoa: ")
        val altura = readLine()!!.toDouble()

        somaAltura += altura

        if (peso > 90) pessoasMaisDe90Kg++
        if (peso < 50 && altura < 1.60) pessoasMenosDe50KgEMenosDe160cm++
        if (altura > 1.90 && peso > 100) pessoasMaisDe190cmEMaisDe100Kg++
    }

    val mediaAltura = somaAltura / 7
    println("Média de altura do grupo: $mediaAltura")
    println("Pessoas com mais de 90kg: $pessoasMaisDe90Kg")
    println("Pessoas com menos de 50kg e menos de 1.60m: $pessoasMenosDe50KgEMenosDe160cm")
    println("Pessoas com mais de 1.90m e mais de 100kg: $pessoasMaisDe190cmEMaisDe100Kg")
}
