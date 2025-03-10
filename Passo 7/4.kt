fun main() {
    println("Digite um valor:")
    val numero = readLine()!!.toInt()

    print("Contagem: ")
    for (i in 0..numero) {
        if (i != numero) {
            print("$i, ")
        } else {
            print("$i")
        }
    }
    println(", FIM!")
}
