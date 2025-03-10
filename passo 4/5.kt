fun main() {
    print("Digite um valor: ")
    val num = readLine()!!.toInt()

    for (i in 1..num) {
        print("$i ")
    }
    println("Acabou!")
}
