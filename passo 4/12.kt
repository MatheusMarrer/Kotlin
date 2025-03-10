import java.util.*

fun main() {
    val random = Random()
    var acimaDeCinco = 0
    var divisiveisPorTres = 0
    val sorteados = mutableListOf<Int>()

    for (i in 1..20) {
        val num = random.nextInt(11) // Números entre 0 e 10
        sorteados.add(num)

        if (num > 5) acimaDeCinco++
        if (num % 3 == 0) divisiveisPorTres++
    }

    println("Números sorteados: $sorteados")
    println("Números acima de 5: $acimaDeCinco")
    println("Números divisíveis por 3: $divisiveisPorTres")
}
