fun main() {
    print("Digite um ano: ")
    val ano = readLine()!!.toInt()
    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        println("$ano é um ano bissexto.")
    } else {
        println("$ano não é um ano bissexto.")
    }
}
