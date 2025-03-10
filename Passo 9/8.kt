fun main() {
    println("Digite o valor de início da contagem:")
    val inicio = readLine()!!.toInt()

    println("Digite o valor de fim da contagem:")
    val fim = readLine()!!.toInt()

    println("Digite o valor do incremento da contagem:")
    val incremento = readLine()!!.toInt()

    Contador(inicio, fim, incremento)
}

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    if (incremento > 0) {
        for (i in inicio..fim step incremento) {
            print("$i ")
        }
    } else {
        println("O incremento deve ser maior que 0.")
    }
