fun main() {
    print("Digite a largura do terreno (em metros): ")
    val largura = readLine()!!.toFloat()
    print("Digite o comprimento do terreno (em metros): ")
    val comprimento = readLine()!!.toFloat()

    val area = largura * comprimento
    println("A área do terreno é: %.2f m²".format(area))

    when {
        area < 100 -> println("TERRENO POPULAR")
        area in 100..500 -> println("TERRENO MASTER")
        else -> println("TERRENO VIP")
    }
}
