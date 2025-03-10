fun main() {
    print("Digite o primeiro valor: ")
    val inicio = readLine()!!.toInt()
    print("Digite o último valor: ")
    val fim = readLine()!!.toInt()
    print("Digite o incremento: ")
    val incremento = readLine()!!.toInt()

    if (inicio < fim) {
        for (i in inicio..fim step incremento) {
            print("$i ")
        }
    } else {
        for (i in inicio downTo fim step -incremento) {
            print("$i ")
        }
    }
    println("Acabou!")
}
